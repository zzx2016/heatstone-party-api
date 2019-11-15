package com.blizzard.heatstone.api.dao;

import com.blizzard.heatstone.api.swagger.model.CardGroup;

public interface CardGroupDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CardGroup record);

    int insertSelective(CardGroup record);

    CardGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardGroup record);

    int updateByPrimaryKey(CardGroup record);
}