package com.mobile.objects;

public class MyChapter {
	private int id;
	private String title;
	private int page;
	private String author;

	public MyChapter(int id, String title, int page, String author) {
		this.id = id;
		this.title = title;
		this.page = page;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
