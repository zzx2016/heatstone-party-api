package com.blizzard.heatstone.api.enums;

public enum ApiStatus {
	
	SUCCESS(1,1,"succes"),
	ERROR(2,-1,"error"),
	EMPTY(3,2,"empty"),
	FAIL(4,0,"fail");
	
	private Integer id;
	
	private Integer code;
	
	private String message;

	private ApiStatus(Integer id, Integer code, String message) {
		this.id = id;
		this.code = code;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
