package cn.cowboy.domain;

import java.util.Date;

public class User2 {
	private Integer userId;
	private String userName;
	private Date regDate;
	private String Passwd;
	private String Name;
	private String Phone;
	private String Email;
	private String stat;
	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
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

	public User2(Integer userId, String userName, Date regDate, String passwd, String name, String phone, String email, String stat) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
		Passwd = passwd;
		Name = name;
		Phone = phone;
		Email = email;
		this.stat = stat;
	}

	public String toString() {
		return "User_id:"+userId+"User_name:"+userName+"Register_date:"+regDate+"Passwd:"+Passwd+"Name:"+Name+"Phone:"+Phone+"Email:"+Email+"stat:"+stat;
	}
};
