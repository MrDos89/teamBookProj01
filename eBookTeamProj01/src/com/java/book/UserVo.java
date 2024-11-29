package com.java.book;

import java.util.Date;

public class UserVo {
	private int uid;
	private String userId;
	private String userPassword;
	private String userName;
	private String address;
	private String phoneNumber;
	private String email;
	private Date birthday;
	private int sex;
	private int admin;
	
	public UserVo() {
		
	}
	
	public UserVo(String userId, String userPassword, String address, 
			String userName, String phoneNumber, String email, Date birthday, int sex, int admin) {
		super();
		
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.birthday = birthday;
		this.sex = sex;
		this.admin = admin;
	}
	
	public UserVo(int uid, String userId, String userPassword, String address, 
			String userName, String phoneNumber, String email, Date birthday, int sex, int admin) {
		super();
		
		this.uid = uid;
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.birthday = birthday;
		this.sex = sex;
		this.admin = admin;
	}
	
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
//	this.birthday = birthday;
//	this.sex = sex;
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public int getSex() {
		return sex;
	}
	
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public int getAdmin() {
		return admin;
	}
	
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	
}
