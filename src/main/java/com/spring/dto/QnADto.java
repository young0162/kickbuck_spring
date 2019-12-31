package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class QnADto {

	/* 글번호 */
	private int num;
	
	/* 글제목 */
	private String title;
	
	/* 글내용 */
	private String content;
	
	/* 작성자 */
	private String user_name;
	
	/* 등록시간 */
	private Timestamp writeday;
	
	/* 등록시간 형 변환 년월일 */
	private String day;
	
	/* 등록시간 형 변환  년월일시간*/
	private String daytime;

	/* 조회수 */
	private int readcnt;
	
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

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Timestamp getWriteday() {
		return writeday;
	}

	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}
	
	// react에서 사용할 수 있게 날짜 형식 변경
	public String getDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(this.getWriteday());
	}
	
	public String getDaytime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(this.getWriteday());
	}
	
		
	
	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}

	// react에서 넘어오는 값을 확인
	@Override
	public String toString() {
		return "QnADto [title=" + title + ", content=" + content + ", user_name=" + user_name + "]";
	}
}
