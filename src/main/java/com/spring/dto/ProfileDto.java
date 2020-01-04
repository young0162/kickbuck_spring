package com.spring.dto;

import java.sql.Timestamp;

public class ProfileDto {

	private int num;
	private String email1;
	private String email2;
	private String user_name;
	private String password;
	private String phone;
	private String image;
	private Timestamp gaipday;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Timestamp getGaipday() {
		return gaipday;
	}
	public void setGaipday(Timestamp gaipday) {
		this.gaipday = gaipday;
	}
	
	@Override
	public String toString() {
		return "ProfileDto [num=" + num + ", email1=" + email1 + ", email2=" + email2 + ", user_name=" + user_name
				+ ", password=" + password + ", phone=" + phone + ", image=" + image + ", gaipday=" + gaipday + "]";
	}
}



















