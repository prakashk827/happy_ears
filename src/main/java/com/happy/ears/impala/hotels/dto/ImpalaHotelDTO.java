package com.happy.ears.impala.hotels.dto;

import java.util.List;

public class ImpalaHotelDTO {

    List<HotelInfoDTO> data;

    public List<HotelInfoDTO> getData() {
        return data;
    }

    public void setData(List<HotelInfoDTO> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ImpalaHotelDTO{" +
                "data=" + data +
                '}';
    }
}
