
package com.blizzard.heatstone.api.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * CardGroupRelation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-24T16:10:04.213+08:00")

public class CardGroupRelation   {
  private Integer cardId = null;

  private Integer groupId = null;

  public CardGroupRelation cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * 卡牌id
   * @return cardId
  **/
  @ApiModelProperty(value = "卡牌id")
  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  public CardGroupRelation groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * 卡组id
   * @return groupId
  **/
  @ApiModelProperty(value = "卡组id")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardGroupRelation cardGroupRelation = (CardGroupRelation) o;
    return Objects.equals(this.cardId, cardGroupRelation.cardId) &&
        Objects.equals(this.groupId, cardGroupRelation.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardGroupRelation {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
