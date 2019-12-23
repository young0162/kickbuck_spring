package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class QnAReplyDto {
	
	/* 댓글번호 */
	private int replyNum;
	
	/* 원글번호 */
	private int qnaNum;
	
	/* 원댓글번호 */
	private int originalNum;
	
	/* 댓글그룹 내 순서 */
	private int groupNum;
	
	/* 댓글그룹 계층 번호 */
	private int stepNum;
	
	/* 글내용 */
	private String replyContent;
	
	/* 작성자 */
	private String nickname;
	
	/* 등록시간 */
	private Timestamp writeday;
	
	/* 등록시간 형변환 */
	private String replyDay;

	
	
	public int getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}

	public int getQnaNum() {
		return qnaNum;
	}

	public void setQnaNum(int qnaNum) {
		this.qnaNum = qnaNum;
	}

	public int getOriginalNum() {
		return originalNum;
	}

	public void setOriginalNum(int originalNum) {
		this.originalNum = originalNum;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public int getStepNum() {
		return stepNum;
	}

	public void setStepNum(int stepNum) {
		this.stepNum = stepNum;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Timestamp getWriteday() {
		return writeday;
	}

	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}
	

	// react에서 사용할 수 있게 날짜 형식 변경해서 전달
	public String getReplyDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(this.getWriteday());
	}
	
	// react에서 넘어오는 값을 확인
		@Override
		public String toString() {
			return "QnAReplyDto [replycontent=" + replyContent + ", nickname=" + nickname + "]";
		}

}
