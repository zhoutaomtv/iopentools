package com.appspot.iopentools.dao;

import java.io.IOException;
import java.util.List;

import com.appspot.iopentools.model.Note;

public interface INoteToolDao {

	public void saveOrUpdate(Note note) throws IOException;
	public void delete(Note note) throws IOException;
	public List<Note> query(String sub, String value) throws IOException;
	public List<Note> list() throws IOException;
}
