package com.happy.ears.impala.hotels.dto;

public class HotelLocation {

    private Double longitude;
    private Double latitude;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "HotelLocation{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
