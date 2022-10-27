package com.hotel.booking.impala.hotels.dto;

public class HotelCheckOut {

    private String to;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "HotelCheckOut{" +
                "to='" + to + '\'' +
                '}';
    }
}
