package com.appspot.iopentools.service;

import com.appspot.iopentools.dao.INoteToolDao;
import com.appspot.iopentools.dao.NoteToolImpl;

public class NoteToolServiceBase {

	protected INoteToolDao noteTool = new NoteToolImpl();
}
