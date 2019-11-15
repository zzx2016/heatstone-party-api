
package com.blizzard.heatstone.api.swagger.api;

import java.util.Map;
import com.blizzard.heatstone.api.swagger.model.CardGroup;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-24T16:10:04.213+08:00")

@Controller
public class CardgroupApiController implements CardgroupApi {

    public ResponseEntity<Map<String, Object>> deleteCardGroupById(
@ApiParam(value = "卡组id",required=true ) @PathVariable("id") Integer id


) {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> insertCardGroup(

@ApiParam(value = "卡牌详情" ,required=true ) @RequestBody CardGroup card

) {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> selectCardGroupById(
@ApiParam(value = "卡组id",required=true ) @PathVariable("id") Integer id


) {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> updateCardGroupById(
@ApiParam(value = "卡组id",required=true ) @PathVariable("id") Integer id


,
        

@ApiParam(value = "卡组信息" ,required=true ) @RequestBody CardGroup cardgroup

) {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

}