package com.hotel.booking.impala.hotels.dto;

public class HotelAmenities {

    private Integer code;
    private String formatted;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    @Override
    public String toString() {
        return "HotelAmenities{" +
                "code=" + code +
                ", formatted='" + formatted + '\'' +
                '}';
    }
}
