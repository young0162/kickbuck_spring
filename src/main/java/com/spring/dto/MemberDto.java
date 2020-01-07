package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MemberDto {

	private int num;
	private String email;
	private String user_name;
	private String password;
	private String profileimg;
	private Timestamp gaipday;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getImage() {
		return profileimg;
	}
	public void setImage(String image) {
		this.profileimg = image;
	}
	
	
	public Timestamp getGaipday() {
		return gaipday;
	}
	public void setGaipday(Timestamp gaipday) {
		this.gaipday = gaipday;
	}
	
	public String getDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(this.getGaipday());
	}
	
	public String getDaytime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(this.getGaipday());
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberDto [num=" + num + ", email=" + email + ", user_name=" + user_name + ", password=" + password
				+ ", profileimg=" + profileimg + ", gaipday=" + gaipday + "]";
	}
	
}
