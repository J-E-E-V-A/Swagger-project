package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
 private int productId;
 private String productName;
 private String productCategorie;
 private String productprice;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategorie() {
	return productCategorie;
}
public void setProductCategorie(String productCategorie) {
	this.productCategorie = productCategorie;
}
public String getProductprice() {
	return productprice;
}
public void setProductprice(String productprice) {
	this.productprice = productprice;
}
public Products(int productId, String productName, String productCategorie, String productprice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCategorie = productCategorie;
	this.productprice = productprice;
}
public Products() {
	super();
}
@Override
public String toString() {
	return "Products [productId=" + productId + ", productName=" + productName + ", productCategorie="
			+ productCategorie + ", productprice=" + productprice + "]";
}

}
