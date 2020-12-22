package com.oms.bean;

public class OrderLine {
	private String productId;
	private String productTitle;
	private float productCost;
	private int productQuantity;
	private double weight;
	public OrderLine(){
	}
	
	public OrderLine(String productId, String productTitle, int productQuantity, float productCost) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
		this.productCost = productCost;
		this.productQuantity = productQuantity;
	}

	public OrderLine(String productId, String productTitle ,int productQuantity, float productCost, float weight) {
		this.productId = productId;
		this.productTitle = productTitle;
		this.productCost = productCost;
		this.productQuantity = productQuantity;
		this.weight = weight;
	}

	public double getProductWeight() {
		return weight;
	}

	public void setProductWeight(Double weight) {
		this.weight = weight;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public float getProductCost() {
		return productCost;
	}

	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}

	public int getProductQuantity() {
		return productQuantity;
	}
	
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
}
