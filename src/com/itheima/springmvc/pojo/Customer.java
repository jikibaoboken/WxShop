package com.itheima.springmvc.pojo;

public class Customer {
	private long customer_id;
	
	private String username;
	private String password;
	private String mailbox;
	private String address;
	private String phone;
	private String sex;
	private String age;
	private String nickname;//昵称
	private String account_createTime;
	private String cyberspace_avatar;//头像 
	private double account;
	private String linkman;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailbox() {
		return mailbox;
	}
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAccount_createTime() {
		return account_createTime;
	}
	public void setAccount_createTime(String account_createTime) {
		this.account_createTime = account_createTime;
	}
	public String getCyberspace_avatar() {
		return cyberspace_avatar;
	}
	public void setCyberspace_avatar(String cyberspace_avatar) {
		this.cyberspace_avatar = cyberspace_avatar;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	
}
