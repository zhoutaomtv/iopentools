/**
 * 
 */
package iopentools.contactbackup.dao;

import iopentools.contactbackup.entity.Contact;

import java.util.List;

/**
 * @author toddy
 * 
 */
public interface IContactDao {

	public void saveOrUpdate(Contact c);

	public void delete(Contact c);
	
	public Contact load(Long id);

	public List<Contact> List();

	public List<Contact> ListBy(String key, String value, int size);
}
