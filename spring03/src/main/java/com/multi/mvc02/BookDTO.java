package com.multi.mvc02;

public class BookDTO {
	private int id;
	private String name;
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	private String img;
	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", name=" + name + ", url=" + url + ", img=" + img + "]";
	}
	

}
