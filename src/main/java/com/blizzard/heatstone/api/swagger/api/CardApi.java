
package com.blizzard.heatstone.api.swagger.api;

import java.util.Map;
import com.blizzard.heatstone.api.swagger.model.Card;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-24T16:10:04.213+08:00")

@Api(value = "card", description = "the card API")
public interface CardApi {

    @ApiOperation(value = "根据主键删除卡牌", notes = "根据主键删除卡牌", response = Object.class, responseContainer = "Map", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口请求成功", response = Object.class) })
    @RequestMapping(value = "/card/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Map<String, Object>> deleteCardById(
@ApiParam(value = "卡牌id",required=true ) @PathVariable("id") Integer id


);


    @ApiOperation(value = "新增卡牌", notes = "新增卡牌", response = Object.class, responseContainer = "Map", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口请求成功", response = Object.class) })
    @RequestMapping(value = "/card/",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Map<String, Object>> insertCard(

@ApiParam(value = "卡牌详情" ,required=true ) @RequestBody Card card

);


    @ApiOperation(value = "根据主键查询卡牌详情", notes = "据主键查询卡牌详情", response = Object.class, responseContainer = "Map", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口请求成功", response = Object.class) })
    @RequestMapping(value = "/card/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Map<String, Object>> selectCardById(
@ApiParam(value = "卡牌id",required=true ) @PathVariable("id") Integer id


);


    @ApiOperation(value = "更新卡牌详情", notes = "更新卡牌详情", response = Object.class, responseContainer = "Map", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口请求成功", response = Object.class) })
    @RequestMapping(value = "/card/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Map<String, Object>> updateCardById(
@ApiParam(value = "卡牌id",required=true ) @PathVariable("id") Integer id


,

@ApiParam(value = "卡牌信息" ,required=true ) @RequestBody Card card

);

}