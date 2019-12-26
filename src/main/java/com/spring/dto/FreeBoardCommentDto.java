package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class FreeBoardCommentDto {
	
	private int pk;
	private int num;
	private int ref;
	private int re_indent;
	private int re_step;
	private String content;
	private String writer;
	private Timestamp writeday;
	private String day;
	
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
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getRe_indent() {
		return re_indent;
	}
	public void setRe_indent(int re_indent) {
		this.re_indent = re_indent;
	}
	public int getRe_step() {
		return re_step;
	}
	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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

	

}
