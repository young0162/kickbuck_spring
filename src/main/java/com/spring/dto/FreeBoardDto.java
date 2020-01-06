package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class FreeBoardDto {
	
	private int num;
	private String title;
	private String content;
	private String imagename;
	private String user_name;
	private int readcnt;
	private Timestamp writeday;
	private String day;
	private String today;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public Timestamp getWriteday() {
		return writeday;
	}
	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}
	public String getDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(this.getWriteday());
	}
	public String getToday() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(this.getWriteday());
	}
	@Override
	public String toString() {
		return "FreeBoardDto [num=" + num + ", title=" + title + ", content=" + content + ", imagename=" + imagename
				+ ", user_name=" + user_name + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
