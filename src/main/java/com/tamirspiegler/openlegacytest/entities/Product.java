package com.tamirspiegler.openlegacytest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer itemId;	
	private String itemInventoryCode;	
	private String itemName;
	private Integer itemAmount;
	
	// JPA default constructor
	public Product() {
		
	}
	
	public Product(Integer itemId, String itemInventoryCode, String itemName, Integer itemAmount) {
		super();
		this.itemId = itemId;
		this.itemInventoryCode = itemInventoryCode;
		this.itemName = itemName;
		this.itemAmount = itemAmount;
	}

	public Integer getItemId() {
		return itemId;
	}
	
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	public String getItemInventoryCode() {
		return itemInventoryCode;
	}
	
	public void setItemInventoryCode(String itemInventoryCode) {
		this.itemInventoryCode = itemInventoryCode;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public Integer getItemAmount() {
		return itemAmount;
	}
	
	public Integer setItemAmount(Integer itemAmount) {
		return this.itemAmount = itemAmount;
	}

	@Override
	public String toString() {
		return "Product [itemId=" + itemId + ", itemInventoryCode=" + itemInventoryCode + ", itemName=" + itemName
				+ ", itemAmount=" + itemAmount + "]";
	}
	
	
}
