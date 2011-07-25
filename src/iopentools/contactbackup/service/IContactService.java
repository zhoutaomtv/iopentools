package iopentools.contactbackup.service;

import iopentools.contactbackup.entity.Contact;

import java.util.List;

public interface IContactService {

	public void saveOrUpdate(Contact c);

	public void delete(Contact c);

	public List<Contact> list();

	public List<Contact> listBy(String key, String value, int size);
}
