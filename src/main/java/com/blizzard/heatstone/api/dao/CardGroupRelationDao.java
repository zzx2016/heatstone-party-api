package com.blizzard.heatstone.api.dao;

import com.blizzard.heatstone.api.swagger.model.CardGroupRelation;

public interface CardGroupRelationDao {
	
    int insert(CardGroupRelation record);

    int insertSelective(CardGroupRelation record);
}