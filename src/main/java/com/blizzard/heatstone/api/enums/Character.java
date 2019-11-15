package com.blizzard.heatstone.api.enums;

/**
 * @author luxun
 * @category 卡牌特效
 *
 */
public enum Character {

	Taunt(1,"嘲讽","taunt",""),
	Battlecry(2,"战吼","battlecry",""),
	Deathrattle(3,"亡语","deathrattle",""),
	;
	
	private Integer id;
	
	private String name;
	
	private String code;
	
	private String description;
	
	private Character(Integer id, String name, String code, String description) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
