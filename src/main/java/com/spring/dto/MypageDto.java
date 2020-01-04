package com.spring.dto;

import java.sql.Timestamp;

public class MypageDto {

	private int num;
	private String title;
	private String content;
	private String imagename;
	private String user_name;
	private int readcnt;
	private Timestamp gaipday;
	
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
	public String getUser_ame() {
		return user_name;
	}
	public void setUser_ame(String user_ame) {
		this.user_name = user_ame;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public Timestamp getGaipday() {
		return gaipday;
	}
	public void setGaipday(Timestamp gaipday) {
		this.gaipday = gaipday;
	}
	
	@Override
	public String toString() {
		return "MypageDto [num=" + num + ", title=" + title + ", content=" + content + ", imagename=" + imagename
				+ ", user_name=" + user_name + ", readcnt=" + readcnt + ", gaipday=" + gaipday + "]";
	}
}
