package com.hotel.booking.impala.hotels.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelDescription {

    @JsonProperty("short")
    private String shortDesc;

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Override
    public String toString() {
        return "HotelDescription{" +
                "shortDesc='" + shortDesc + '\'' +
                '}';
    }
}
