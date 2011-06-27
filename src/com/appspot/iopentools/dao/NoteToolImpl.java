package com.appspot.iopentools.dao;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import com.appspot.iopentools.model.Note;

public class NoteToolImpl extends NoteToolBase implements INoteToolDao {
	
	private final static Logger log = Logger.getLogger(NoteToolImpl.class.getName());
	
	@Override
	public void saveOrUpdate(Note note) throws IOException {
		try {
			pm.makePersistent(note);
		} finally {
			pm.close();
		}
	}

	@Override
	public void delete(Note note) throws IOException {
		try {
			pm.deletePersistent(note);
		} finally {
			pm.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Note> query(String sub, String value) throws IOException {
		List<Note> notes = null;
		String query = "select from " + Note.class.getName() + " where " + sub + " == " + value;
		try {
			notes = (List<Note>) pm.newQuery(query).execute();
		} finally {
			pm.close();
		}
		return notes;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Note> list() throws IOException {
		List<Note> notes = null;
		String query = "select from " + Note.class.getName();
		try {
			notes = (List<Note>) pm.newQuery(query).execute();
		} finally {
			pm.close();
		}
		return notes;
	}

}
