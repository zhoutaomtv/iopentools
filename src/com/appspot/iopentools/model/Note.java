package com.appspot.iopentools.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Text;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Note {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private String owner;
	
	@Persistent
	private String created;
	
	@Persistent
	private String title;	
	
	@Persistent
	private Text content;
	
	@Persistent
	private List<String> comments;
	
	public Note() {
		//empty
	}
	
	public Note(String owner, String title, Text content, List<String> comments) {
		this.owner = owner;
		this.title = title;
		this.content = content;
		this.comments = comments;
		this.created = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Text getContent() {
		return content;
	}

	public void setContent(Text content) {
		this.content = content;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	
	
}
