package com.multi.mvc700;

public class FoodVO {
	private int no;
	private String name;
	private int price;
	private String img;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "FoodVO [no=" + no + ", name=" + name + ", price=" + price + ", img=" + img + "]";
	}
	
	

}
