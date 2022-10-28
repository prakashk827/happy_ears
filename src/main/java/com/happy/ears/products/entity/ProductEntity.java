package com.happy.ears.products.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.happy.ears.utils.Utils;

import javax.persistence.*;


@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long productId;

    @JsonProperty("sku")
    @Column(name = "sku")
    private String skuId;
    @JsonProperty("product_name")
    @Column(name = "product_name")
    private String productName;
    @JsonProperty("short_description")
    @Column(name = "short_description")
    private String shortDescription;
    @JsonProperty("mrp_price")
    @Column(name = "mrp_price")
    private Double mrpPrice;
    @JsonProperty("selling_price")
    @Column(name = "selling_price")
    private Double sellingPrice;

    @JsonProperty("main_image_url")
    @Column(name = "main_image_url")
    private String mainImageUrl;
    @JsonProperty("in_stock")
    @Column(name = "in_stock")
    private int inStock;
    @JsonProperty("jewellery_type")
    @Column(name = "jewellery_type")
    private String jewelleryType;
    @JsonProperty("metal_type")
    @Column(name = "metal_type")
    private String metalType;
    @JsonProperty("stone_type")
    @Column(name = "stone_type")
    private String stoneType;
    @JsonProperty("jewellery_shape")
    @Column(name = "jewellery_shape")
    private String jewelleryShape;
    @JsonProperty("jewellery_colour")
    @Column(name = "jewellery_colour")
    private String jewelleryColour;
    @JsonProperty("tag")
    @Column(name = "tag")
    private String tag;

    @JsonProperty("items_sold")
    @Column(name = "items_sold")
    private Long itemsSold =0L;


    @Column(name = "created_at")
    @JsonProperty("created_at")
    private String createdAt = Utils.GetCurrentTimeStamp().toString();

    @Column(name = "updated_at")
    @JsonProperty("updated_at")
    private String updatedAt = Utils.GetCurrentTimeStamp().toString().toString();

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Double getMrpPrice() {
        return mrpPrice;
    }

    public void setMrpPrice(Double mrpPrice) {
        this.mrpPrice = mrpPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getJewelleryType() {
        return jewelleryType;
    }

    public void setJewelleryType(String jewelleryType) {
        this.jewelleryType = jewelleryType;
    }

    public String getMetalType() {
        return metalType;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType;
    }

    public String getStoneType() {
        return stoneType;
    }

    public void setStoneType(String stoneType) {
        this.stoneType = stoneType;
    }

    public String getJewelleryShape() {
        return jewelleryShape;
    }

    public void setJewelleryShape(String jewelleryShape) {
        this.jewelleryShape = jewelleryShape;
    }

    public String getJewelleryColour() {
        return jewelleryColour;
    }

    public void setJewelleryColour(String jewelleryColour) {
        this.jewelleryColour = jewelleryColour;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(Long itemsSold) {
        this.itemsSold = itemsSold;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "ProductEntity{" +
                "productId=" + productId +
                ", skuId='" + skuId + '\'' +
                ", productName='" + productName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", mrpPrice=" + mrpPrice +
                ", sellingPrice=" + sellingPrice +
                ", mainImageUrl='" + mainImageUrl + '\'' +
                ", inStock=" + inStock +
                ", jewelleryType='" + jewelleryType + '\'' +
                ", metalType='" + metalType + '\'' +
                ", stoneType='" + stoneType + '\'' +
                ", jewelleryShape='" + jewelleryShape + '\'' +
                ", jewelleryColour='" + jewelleryColour + '\'' +
                ", tag='" + tag + '\'' +
                ", itemsSold=" + itemsSold +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
