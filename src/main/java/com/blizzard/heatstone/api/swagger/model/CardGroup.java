
package com.blizzard.heatstone.api.swagger.model;

import java.util.Objects;
import com.blizzard.heatstone.api.swagger.model.Card;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;




/**
 * CardGroup
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-24T16:10:04.213+08:00")

public class CardGroup   {
  private Integer id = null;

  private String name = null;

  private String logo = null;

  private String source = null;

  private String cardDetail = null;

  private Integer adapted = null;

  private Integer occuptionId = null;

  private String description = null;

  private Date createTime = null;

  private List<Card> cardList = new ArrayList<Card>();

  public CardGroup id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * 主键id
   * @return id
  **/
  @ApiModelProperty(value = "主键id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 卡组名称
   * @return name
  **/
  @ApiModelProperty(value = "卡组名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CardGroup logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * 卡组logo
   * @return logo
  **/
  @ApiModelProperty(value = "卡组logo")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public CardGroup source(String source) {
    this.source = source;
    return this;
  }

   /**
   * 卡组来源
   * @return source
  **/
  @ApiModelProperty(value = "卡组来源")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CardGroup cardDetail(String cardDetail) {
    this.cardDetail = cardDetail;
    return this;
  }

   /**
   * 卡组详情
   * @return cardDetail
  **/
  @ApiModelProperty(value = "卡组详情")
  public String getCardDetail() {
    return cardDetail;
  }

  public void setCardDetail(String cardDetail) {
    this.cardDetail = cardDetail;
  }

  public CardGroup adapted(Integer adapted) {
    this.adapted = adapted;
    return this;
  }

   /**
   * 适用环境
   * @return adapted
  **/
  @ApiModelProperty(value = "适用环境")
  public Integer getAdapted() {
    return adapted;
  }

  public void setAdapted(Integer adapted) {
    this.adapted = adapted;
  }

  public CardGroup occuptionId(Integer occuptionId) {
    this.occuptionId = occuptionId;
    return this;
  }

   /**
   * 卡组所属职业
   * @return occuptionId
  **/
  @ApiModelProperty(value = "卡组所属职业")
  public Integer getOccuptionId() {
    return occuptionId;
  }

  public void setOccuptionId(Integer occuptionId) {
    this.occuptionId = occuptionId;
  }

  public CardGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 卡组描述
   * @return description
  **/
  @ApiModelProperty(value = "卡组描述")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CardGroup createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 添加时间
   * @return createTime
  **/
  @ApiModelProperty(value = "添加时间")
  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public CardGroup cardList(List<Card> cardList) {
    this.cardList = cardList;
    return this;
  }

  public CardGroup addCardListItem(Card cardListItem) {
    this.cardList.add(cardListItem);
    return this;
  }

   /**
   * Get cardList
   * @return cardList
  **/
  @ApiModelProperty(value = "")
  public List<Card> getCardList() {
    return cardList;
  }

  public void setCardList(List<Card> cardList) {
    this.cardList = cardList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardGroup cardGroup = (CardGroup) o;
    return Objects.equals(this.id, cardGroup.id) &&
        Objects.equals(this.name, cardGroup.name) &&
        Objects.equals(this.logo, cardGroup.logo) &&
        Objects.equals(this.source, cardGroup.source) &&
        Objects.equals(this.cardDetail, cardGroup.cardDetail) &&
        Objects.equals(this.adapted, cardGroup.adapted) &&
        Objects.equals(this.occuptionId, cardGroup.occuptionId) &&
        Objects.equals(this.description, cardGroup.description) &&
        Objects.equals(this.createTime, cardGroup.createTime) &&
        Objects.equals(this.cardList, cardGroup.cardList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, logo, source, cardDetail, adapted, occuptionId, description, createTime, cardList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    cardDetail: ").append(toIndentedString(cardDetail)).append("\n");
    sb.append("    adapted: ").append(toIndentedString(adapted)).append("\n");
    sb.append("    occuptionId: ").append(toIndentedString(occuptionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    cardList: ").append(toIndentedString(cardList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
