package com.blizzard.heatstone.api.dao;

import com.blizzard.heatstone.api.swagger.model.Card;

public interface CardDao {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}