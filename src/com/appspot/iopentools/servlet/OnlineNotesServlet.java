package com.appspot.iopentools.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appspot.iopentools.model.Note;
import com.appspot.iopentools.service.INoteToolService;
import com.appspot.iopentools.service.NoteToolService;
import com.google.appengine.api.datastore.Text;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class OnlineNotesServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		if (user == null) {
			return;
		}
		String command = req.getParameter("command");
		String title = req.getParameter("title");
		String owner = user.getNickname();		
		Text content = null;//req.get.getParameter("content");
		List<String> comments = null;
		String sub = req.getParameter("sub");
		String value = req.getParameter("value");
		Note note = new Note(owner, title, content, comments);
		INoteToolService noteToolService = new NoteToolService();
		if (command.equals("Save") || command.equals("Update")) {
			noteToolService.saveOrUpdate(note);
		} else if (command.equals("Delete")) {
			noteToolService.delete(note);
		} else if (command.equals("Query")) {
			noteToolService.query(sub, value);
		} else if (command.equals("List")) {
			List<Note> nots = noteToolService.list();
			try {
				req.getRequestDispatcher("list.jsp").forward(req, res);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doPost(req, res);
	}
}
