package com.multi.gazeeMini;

public class ProductSoldVO {
	private String seller;
	private String buyer;
	private int no;
	private String title;
	private int price;
	
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductSoldVO [seller=" + seller + ", buyer=" + buyer + ", no=" + no + ", title=" + title + ", price="
				+ price + "]";
	}
	
	
}
