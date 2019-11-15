
package com.blizzard.heatstone.api.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;




/**
 * Card
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-24T16:10:04.213+08:00")

public class Card   {
  private Integer id = null;

  private String name = null;

  private Integer costs = null;

  private Integer quality = null;

  private Integer characters = null;

  private Integer race = null;

  private String imgUrl = null;

  private String barImgUrl = null;

  private Integer occupationId = null;

  private Integer dust = null;

  private Integer source = null;

  private String effectDesc = null;

  private Integer adapted = null;

  private Date createTime = null;

  public Card id(Integer id) {
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

  public Card name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 名称
   * @return name
  **/
  @ApiModelProperty(value = "名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Card costs(Integer costs) {
    this.costs = costs;
    return this;
  }

   /**
   * 卡片费用
   * @return costs
  **/
  @ApiModelProperty(value = "卡片费用")
  public Integer getCosts() {
    return costs;
  }

  public void setCosts(Integer costs) {
    this.costs = costs;
  }

  public Card quality(Integer quality) {
    this.quality = quality;
    return this;
  }

   /**
   * 卡牌品质
   * @return quality
  **/
  @ApiModelProperty(value = "卡牌品质")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  public Card characters(Integer characters) {
    this.characters = characters;
    return this;
  }

   /**
   * 特效
   * @return characters
  **/
  @ApiModelProperty(value = "特效")
  public Integer getCharacters() {
    return characters;
  }

  public void setCharacters(Integer characters) {
    this.characters = characters;
  }

  public Card race(Integer race) {
    this.race = race;
    return this;
  }

   /**
   * 种族
   * @return race
  **/
  @ApiModelProperty(value = "种族")
  public Integer getRace() {
    return race;
  }

  public void setRace(Integer race) {
    this.race = race;
  }

  public Card imgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

   /**
   * 图片链接
   * @return imgUrl
  **/
  @ApiModelProperty(value = "图片链接")
  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public Card barImgUrl(String barImgUrl) {
    this.barImgUrl = barImgUrl;
    return this;
  }

   /**
   * 条形图片链接
   * @return barImgUrl
  **/
  @ApiModelProperty(value = "条形图片链接")
  public String getBarImgUrl() {
    return barImgUrl;
  }

  public void setBarImgUrl(String barImgUrl) {
    this.barImgUrl = barImgUrl;
  }

  public Card occupationId(Integer occupationId) {
    this.occupationId = occupationId;
    return this;
  }

   /**
   * 所属职业
   * @return occupationId
  **/
  @ApiModelProperty(value = "所属职业")
  public Integer getOccupationId() {
    return occupationId;
  }

  public void setOccupationId(Integer occupationId) {
    this.occupationId = occupationId;
  }

  public Card dust(Integer dust) {
    this.dust = dust;
    return this;
  }

   /**
   * 粉尘
   * @return dust
  **/
  @ApiModelProperty(value = "粉尘")
  public Integer getDust() {
    return dust;
  }

  public void setDust(Integer dust) {
    this.dust = dust;
  }

  public Card source(Integer source) {
    this.source = source;
    return this;
  }

   /**
   * 来源
   * @return source
  **/
  @ApiModelProperty(value = "来源")
  public Integer getSource() {
    return source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public Card effectDesc(String effectDesc) {
    this.effectDesc = effectDesc;
    return this;
  }

   /**
   * 效果描述
   * @return effectDesc
  **/
  @ApiModelProperty(value = "效果描述")
  public String getEffectDesc() {
    return effectDesc;
  }

  public void setEffectDesc(String effectDesc) {
    this.effectDesc = effectDesc;
  }

  public Card adapted(Integer adapted) {
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

  public Card createTime(Date createTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.id, card.id) &&
        Objects.equals(this.name, card.name) &&
        Objects.equals(this.costs, card.costs) &&
        Objects.equals(this.quality, card.quality) &&
        Objects.equals(this.characters, card.characters) &&
        Objects.equals(this.race, card.race) &&
        Objects.equals(this.imgUrl, card.imgUrl) &&
        Objects.equals(this.barImgUrl, card.barImgUrl) &&
        Objects.equals(this.occupationId, card.occupationId) &&
        Objects.equals(this.dust, card.dust) &&
        Objects.equals(this.source, card.source) &&
        Objects.equals(this.effectDesc, card.effectDesc) &&
        Objects.equals(this.adapted, card.adapted) &&
        Objects.equals(this.createTime, card.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, costs, quality, characters, race, imgUrl, barImgUrl, occupationId, dust, source, effectDesc, adapted, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    barImgUrl: ").append(toIndentedString(barImgUrl)).append("\n");
    sb.append("    occupationId: ").append(toIndentedString(occupationId)).append("\n");
    sb.append("    dust: ").append(toIndentedString(dust)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    effectDesc: ").append(toIndentedString(effectDesc)).append("\n");
    sb.append("    adapted: ").append(toIndentedString(adapted)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
