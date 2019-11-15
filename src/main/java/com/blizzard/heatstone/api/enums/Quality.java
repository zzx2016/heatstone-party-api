package com.blizzard.heatstone.api.enums;
/**
 * 
 * @author luxun
 * @category 卡牌品质
 *
 */
public enum Quality {
	
	NORMAL(1,"普通","normal"),
	RARE(2,"稀有","rare"),
	EPIC(3,"史诗","epic"),
	LEGEND(4,"传说","legend"),
	BASIC(5,"基础","basic");
	
	
	private int id;
	
	private String name;
	
	private String code;

	private Quality(int id, String name, String code) {
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
