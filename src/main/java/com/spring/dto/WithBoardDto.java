package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class WithBoardDto {
	
	/* 함께하기 게시판 번호 */
	private int with_num;
	
	/* 글 그룹의 번호 */
	private int group_num;
	
	/* 댓글 계층 - 계층은 1단계만 사용하므로 댓글은 1, 대댓글은 2 만사용 */
	private int step_num;
	
	/* bucket 게시물의 번호 */
	private int num;
	
	/* 작성자의 사용자 이름 */
	private String user_name;
	
	/* 글 내용 */
	private String comment;
	
	/* 이미지 이름 */
	private String image_name;
	
	/* 글 작성 시간 */
	private Timestamp writeday;
	
	/* 등록시간 형 변환  년월일시간 */
	private String daytime;

	
	
	public int getWith_num() {
		return with_num;
	}

	public void setWith_num(int with_num) {
		this.with_num = with_num;
	}

	public int getGroup_num() {
		return group_num;
	}

	public void setGroup_num(int group_num) {
		this.group_num = group_num;
	}

	public int getStep_num() {
		return step_num;
	}

	public void setStep_num(int step_num) {
		this.step_num = step_num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
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
	
	// react에서 넘어오는 값을 확인
	@Override
	public String toString() {
		return "WithBoard [comment=" + comment + ", user_name=" + user_name + ", image_name=" + image_name + "]";
	}
	
}
