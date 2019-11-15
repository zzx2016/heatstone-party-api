package com.blizzard.heatstone.api.enums;

public enum Environment {
	
	NORMAL(1,"标准","normal"),
	WILD(2,"狂野","wild");
	
	private int id;
	
	private String name;
	
	private String code;

	private Environment(int id, String name, String code) {
		this.id = id;
		this.name = name;
		this.code = code;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
