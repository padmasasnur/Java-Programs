package com.ob.hibernatemanytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String name;
	private String mailid;
	private String password;
	@ManyToMany(cascade=CascadeType.PERSIST)
	private List<Application> app;
	public User() {
		super();
	}
	public User(int id, String name, String mailid, String password, List<Application> app) {
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
		this.password = password;
		this.app = app;
	}
	public int getId() {
		return id;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Application> getApp() {
		return app;
	}
	public void setApp(List<Application> app) {
		this.app = app;
	}
	
	
	
	

}
