package com.example.inventorycrud1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Itemstable")
public class InventoryEntity {
@Id
private int id;

private String name;
private int quantity;
private double price;
public InventoryEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public InventoryEntity(int id, String name, int quantity, double price) {
	super();
	this.id = id;
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}
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
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}



}