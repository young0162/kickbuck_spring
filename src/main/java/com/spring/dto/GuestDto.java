package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GuestDto {
	private int num;
	private String nickname;
	private String contents;
	private Timestamp writeday;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	

	public String getNickname() {
		return this.nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getContents() {
		return this.contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}

	public Timestamp getWriteday() {
		return writeday;
	}

	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}
	
	public String getDaytime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(this.getWriteday());
	}
	
	@Override
	public String toString() {
		return "GuestDto [num=" + num + ", nickname=" + nickname + ", contents=" + contents + ", writeday=" + writeday
				+ "]";
	}
	
	
}