package iopentools.contactbackup.service;

import iopentools.contactbackup.dao.ContactDaoImpl;
import iopentools.contactbackup.dao.IContactDao;
import iopentools.contactbackup.entity.Contact;

import java.util.List;

public class ContactServiceImpl implements IContactService {

	IContactDao contactDao = new ContactDaoImpl();
	@Override
	public void saveOrUpdate(Contact c) {
		// TODO Auto-generated method stub
		contactDao.saveOrUpdate(c);
	}

	@Override
	public void delete(Contact c) {
		// TODO Auto-generated method stub
		if (contactDao.load(c.getId()) != null) {
			contactDao.delete(c);
		}
	}

	@Override
	public List<Contact> list() {
		// TODO Auto-generated method stub
		return contactDao.List();
	}

	@Override
	public List<Contact> listBy(String key, String value, int size) {
		// TODO Auto-generated method stub
		return contactDao.ListBy(key, value, size);
	}

}
