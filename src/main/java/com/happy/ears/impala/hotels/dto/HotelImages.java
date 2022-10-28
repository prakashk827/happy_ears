package com.happy.ears.impala.hotels.dto;

public class HotelImages {

    private String altText;
    private String height;
    private String width;
    private String url;
    private Boolean isHeroImage;

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getHeroImage() {
        return isHeroImage;
    }

    public void setHeroImage(Boolean heroImage) {
        isHeroImage = heroImage;
    }

    @Override
    public String toString() {
        return "HotelImages{" +
                "altText='" + altText + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", url='" + url + '\'' +
                ", isHeroImage=" + isHeroImage +
                '}';
    }
}
