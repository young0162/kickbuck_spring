package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MemberDto {

	private int num;
	private String email1;
	private String email2;
	private String name;
	private String password;
	private String phone;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "MemberDto [num=" + num + ", email1=" + email1 + ", email2=" + email2 + ", name=" + name + ", password="
				+ password + ", phone=" + phone + ", gaipday=" + gaipday + "]";
	}
}
