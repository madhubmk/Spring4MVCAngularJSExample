package com.websystique.springmvc.model;

public class Products {
	
	private long uid;
	private String image;
	private String sizes;
	private String name;
	private String colors;
	private String text;
	private String price;
	
	public Products(long uid, String image, String sizes, String name, String colors, String text, String price){
		this.uid = uid;
		this.image = image;
		this.sizes = sizes;
		this.name = name;
		this.colors = colors;
		this.text = text;
		this.price = price;
	}
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Products [uid=" + uid + ", name=" + name + ", image=" + image
				+ ", sizes=" + sizes + ", colors="+colors+", text=" + text + ", price="+ price + "]";
	}
}
