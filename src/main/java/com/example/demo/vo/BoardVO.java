package com.example.demo.vo;

import java.sql.Date;

/**
 * BoardVO
 */
public class BoardVO {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;

	public int getBno() {
		return this.bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

    
}