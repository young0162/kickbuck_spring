package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class BucketCommentDto {
	
	private int num;
	private String user_name;
	private String type;
	private String subject;
	private String content;
	private String image;
	private int likecount;
	private int withcount;
	private String hashtag;
	private String area;
	private String dday;
	private String []imgarr;
	private String []hasharr;
	private String []witharr;
	private String []likearr;
	private Timestamp writeday;
	private int withopen;
	private String open;
	private int person;
	private String with_user;
	private String like_user;
	
	
	


	
	@Override
	public String toString() {
		return "BucketDto [num=" + num + ", user_name=" + user_name + ", type=" + type + ", subject=" + subject
				+ ", content=" + content + ", image=" + image + ", likecount=" + likecount + ", withcount=" + withcount
				+ ", hashtag=" + hashtag + ", area=" + area + ", dday=" + dday + ", imgarr=" + Arrays.toString(imgarr)
				+ ", hasharr=" + Arrays.toString(hasharr) + ", witharr=" + Arrays.toString(witharr) + ", likearr="
				+ Arrays.toString(likearr) + ", writeday=" + writeday + ", withopen=" + withopen + ", open=" + open
				+ ", person=" + person + ", with_user=" + with_user + ", like_user=" + like_user + "]";
	}

	public String[] getWitharr() {
		return witharr;
	}

	public String[] getLikearr() {
		return likearr;
	}
	
	public void setWitharr(String[] witharr) {
		this.witharr = witharr;
	}

	public void setLikearr(String[] likearr) {
		this.likearr = likearr;
	}
	
	public void setImage(String image) {
		this.image = image;
		this.imgarr();
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
		this.hasharr();
	}
	
	public String getWith_user() {
		return with_user;
	}

	public void setWith_user(String with_user) {
		this.with_user = with_user;
		this.witharr();
	}

	public String getLike_user() {
		return like_user;
	}

	public void setLike_user(String like_user) {
		this.like_user = like_user;
		this.likearr();
	}

	public String[] getHasharr() {
		return hasharr;
	}

	public void setHasharr(String[] hasharr) {
		this.hasharr = hasharr;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	

	public int getLikecount() {
		return likecount;
	}

	public void setLikecount(int likecount) {
		this.likecount = likecount;
	}

	public int getWithcount() {
		return withcount;
	}

	public void setWithcount(int withcount) {
		this.withcount = withcount;
	}

	public String getHashtag() {
		return hashtag;
	}

	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDday() {
		return dday;
	}

	public void setDday(String dday) {
		this.dday = dday;
	}

	public Timestamp getWriteday() {
		return writeday;
	}

	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}

	public int getWithopen() {
		return withopen;
	}

	public void setWithopen(int withopen) {
		this.withopen = withopen;
	}



	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	
	
	
	public String getDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(this.getWriteday());
	}
	
	public String getDaytime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(this.getWriteday());
	}

	public String[] getImgarr() {
		return imgarr;
	}

	public void setImgarr(String[] imgarr) {
		this.imgarr = imgarr;
	}
	
	
	public void imgarr() {
		imgarr = this.getImage().split(",");
	}
	
	public void hasharr() {
		hasharr = this.getHashtag().split(",");
	}
	
	public void witharr() {
		witharr = this.getWith_user().split(",");
	}
	
	public void likearr() {
		likearr = this.getLike_user().split(",");
	}
	
	
}
