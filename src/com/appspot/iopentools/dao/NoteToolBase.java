package com.appspot.iopentools.dao;

import javax.jdo.PersistenceManager;

import com.appspot.iopentools.common.PMF;

public class NoteToolBase {

	protected PersistenceManager pm = PMF.getInstance().getPersistenceManager();
}
