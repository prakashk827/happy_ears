package com.happy.ears.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDTO {

    @JsonProperty("product_id")
    private Long productId;
    @JsonProperty("sku")
    private String skuId;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("mrp_price")
    private Double mrpPrice;
    @JsonProperty("selling_price")
    private Double sellingPrice;
    @JsonProperty("main_image_url")
    private String mainImageUrl;
    @JsonProperty("in_stock")
    private int inStock;
    @JsonProperty("jewellery_type")
    private String jewelleryType;
    @JsonProperty("metal_type")
    private String metalType;
    @JsonProperty("stone_type")
    private String stoneType;
    @JsonProperty("jewellery_shape")
    private String jewelleryShape;
    @JsonProperty("jewellery_colour")
    private String jewelleryColour;
    @JsonProperty("tag")
    private String tag;


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

    @Override
    public String toString() {
        return "ProductDTO{" +
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
                '}';
    }
}
