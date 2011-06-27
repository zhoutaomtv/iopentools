package com.appspot.iopentools.service;

import java.io.IOException;
import java.util.List;

import com.appspot.iopentools.model.Note;

public class NoteToolService extends NoteToolServiceBase implements INoteToolService {

	@Override
	public void saveOrUpdate(Note note) throws IOException {
		noteTool.saveOrUpdate(note);
	}

	@Override
	public void delete(Note note) throws IOException {
		noteTool.delete(note);
	}

	@Override
	public List<Note> query(String sub, String value) throws IOException {
		return noteTool.query(sub, value);
	}

	@Override
	public List<Note> list() throws IOException {
		return noteTool.list();
	}

}
