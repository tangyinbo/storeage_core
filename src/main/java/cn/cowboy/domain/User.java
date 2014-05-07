package cn.cowboy.domain;

import java.util.Date;

public class User {
	private Integer User_id;
	private String User_name;
	private Date Register_date;
	private String Passwd;
	private String Name;
	private String Phone;
	private String Email;
	private String stat;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer user_id, String user_name, Date register_date, String passwd, String name, String phone, String email, String stat) {
		super();
		User_id = user_id;
		User_name = user_name;
		Register_date = register_date;
		Passwd = passwd;
		Name = name;
		Phone = phone;
		Email = email;
		this.stat = stat;
	}
	public Integer getUser_id() {
		return User_id;
	}
	public void setUser_id(Integer user_id) {
		User_id = user_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public Date getRegister_date() {
		return Register_date;
	}
	public void setRegister_date(Date register_date) {
		Register_date = register_date;
	}
	public String getPasswd() {
		return Passwd;
	}
	public void setPasswd(String passwd) {
		Passwd = passwd;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	@Override
	public String toString() {
		return "User_id:"+User_id+"User_name:"+User_name+"Register_date:"+Register_date+"Passwd:"+Passwd+"Name:"+Name+"Phone:"+Phone+"Email:"+Email+"stat:"+stat;
	}
};
