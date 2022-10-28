package com.happy.ears.impala.hotels.dto;

public class HotelCheckIn {

    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


    @Override
    public String toString() {
        return "HotelCheckIn{" +
                "from='" + from + '\'' +
                '}';
    }
}
