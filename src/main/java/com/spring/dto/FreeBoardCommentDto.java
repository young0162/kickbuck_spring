package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class FreeBoardCommentDto {

		/* 댓글 번호 */
		private int comment_num;
		
		/* 댓글 그룹의 번호 */
		private int group_num;
		
		/* 댓글 계층 - 계층은 1단계만 사용하므로 댓글은 1, 대댓글은 2 만사용 */
		private int step_num;
		
		/* qna 게시물의 번호 */
		private int num;
		
		/* 작성자의 닉네임 */
		private String user_name;
		
		/* 댓글 내용 */
		private String comment;
		
		/* 댓글 작성 시간 */
		private Timestamp writeday;
		
		/* 등록시간 형 변환  년월일시간 */
		private String daytime;	
		
		public int getComment_num() {
			return comment_num;
		}

		public void setComment_num(int comment_num) {
			this.comment_num = comment_num;
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
			return "FreeBoardCommentDto [num=" + num + ", user_name=" + user_name + ", comment=" + comment + "]";
		}
		
		
		
		
		
	}


