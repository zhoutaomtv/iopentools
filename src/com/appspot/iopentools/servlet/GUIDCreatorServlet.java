package com.appspot.iopentools.servlet;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GUIDCreatorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/plain");
		res.getWriter().println(UUID.randomUUID().toString());
		res.getWriter().println("");
	}
}
