
package com.blizzard.heatstone.api.swagger.api;

import java.util.Map;
import com.blizzard.heatstone.api.swagger.model.CardGroup;

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

@Api(value = "cardgroup", description = "the cardgroup API")
public interface CardgroupApi {

    @ApiOperation(value = "删除卡组", notes = "删除卡组", response = Object.class, responseContainer = "Map", tags={ "cardgroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "删除接口请求成功", response = Object.class) })
    @RequestMapping(value = "/cardgroup/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Map<String, Object>> deleteCardGroupById(
@ApiParam(value = "卡组id",required=true ) @PathVariable("id") Integer id


);


    @ApiOperation(value = "新增卡组", notes = "新增卡组", response = Object.class, responseContainer = "Map", tags={ "cardgroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "新增接口请求成功", response = Object.class) })
    @RequestMapping(value = "/cardgroup/",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Map<String, Object>> insertCardGroup(

@ApiParam(value = "卡牌详情" ,required=true ) @RequestBody CardGroup card

);


    @ApiOperation(value = "根据主键查询卡组详情", notes = "根据主键查询卡组详情", response = Object.class, responseContainer = "Map", tags={ "cardgroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "查询接口请求成功", response = Object.class) })
    @RequestMapping(value = "/cardgroup/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Map<String, Object>> selectCardGroupById(
@ApiParam(value = "卡组id",required=true ) @PathVariable("id") Integer id


);


    @ApiOperation(value = "更新卡组信息", notes = "更新卡组信息", response = Object.class, responseContainer = "Map", tags={ "cardgroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "更新接口请求成功", response = Object.class) })
    @RequestMapping(value = "/cardgroup/{id}",
        method = RequestMethod.PUT)
    ResponseEntity<Map<String, Object>> updateCardGroupById(
@ApiParam(value = "卡组id",required=true ) @PathVariable("id") Integer id


,

@ApiParam(value = "卡组信息" ,required=true ) @RequestBody CardGroup cardgroup

);

}