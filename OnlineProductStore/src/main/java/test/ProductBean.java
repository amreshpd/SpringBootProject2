package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable{
	private String code,name;
	private Double price;
	private Integer quantity;
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
/*
 ----------------------------------------- -------- ----------------------------
 CODE                                      NOT NULL VARCHAR2(100)
 NAME                                               VARCHAR2(100)
 PRICE                                              NUMBER(10,2)
 QTY                                                NUMBER(5)
*/