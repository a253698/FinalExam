package com.exam;

public class Product {
	
	String ProductNo;
	String ProductName;
	int price;
	int calorie;
	
	public Product(String ProductNo,String ProductName,int price,int calorie){
		this.ProductNo = ProductNo;
		this.ProductName = ProductName;
		this.price = price;
		this.calorie = calorie;
	}
	
	public boolean isOk(int orderNo,int orderhowmay) {
		boolean ok = true;

		return ok;
	}
	
	public String getProductNo() {
		return ProductNo;
	}
	public void setProductNo(String productNo) {
		ProductNo = productNo;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}


}
