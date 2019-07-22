package com.tamirspiegler.openlegacytest.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class updateItemAmountDTO {
	
	@Id
	@NotNull
	private Integer itemId;
	
	@NotNull
	private Integer itemAmount;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(Integer itemAmount) {
		this.itemAmount = itemAmount;
	}

}
