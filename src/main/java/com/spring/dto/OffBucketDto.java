package com.spring.dto;

import java.sql.Timestamp;

public class OffBucketDto {
	
	private int pk;
	private int num;
	private String image;
	private String user_name;
	private String content;
	private String endday;
	private Timestamp writeday;
	private String subject;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getPk() {
		return pk;
	}
	public void setPk(int pk) {
		this.pk = pk;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEndday() {
		return endday;
	}
	public void setEndday(String endday) {
		this.endday = endday;
	}
	public Timestamp getWriteday() {
		return writeday;
	}
	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}
	@Override
	public String toString() {
		return "OffBucketDto [pk=" + pk + ", num=" + num + ", image=" + image + ", user_name=" + user_name
				+ ", content=" + content + ", endday=" + endday + ", subject=" + subject + "]";
	}
	
	
	
	
	
	

}
