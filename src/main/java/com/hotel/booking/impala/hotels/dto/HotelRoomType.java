package com.hotel.booking.impala.hotels.dto;

import java.util.List;

public class HotelRoomType {

    private String roomTypeId;
    private String name;
    private String description;
    private Integer maxOccupancy;
    private List<Object> rates;
    private List<HotelAmenities> amenities;
    List<HotelImages> images;


    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public List<Object> getRates() {
        return rates;
    }

    public void setRates(List<Object> rates) {
        this.rates = rates;
    }

    public List<HotelAmenities> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<HotelAmenities> amenities) {
        this.amenities = amenities;
    }

    public List<HotelImages> getImages() {
        return images;
    }

    public void setImages(List<HotelImages> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "HotelRoomType{" +
                "roomTypeId='" + roomTypeId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", maxOccupancy=" + maxOccupancy +
                ", rates=" + rates +
                ", amenities=" + amenities +
                ", images=" + images +
                '}';
    }
}
