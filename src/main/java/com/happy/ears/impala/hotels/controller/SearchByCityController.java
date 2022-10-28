package com.happy.ears.impala.hotels.controller;

import com.happy.ears.dto.Response;
import com.happy.ears.custom_exception.CustomException;
import com.happy.ears.impala.hotels.dto.HotelInfoDTO;
import com.happy.ears.impala.hotels.dto.ImpalaHotelDTO;
import com.happy.ears.impala.hotels.service.SearchHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping("/hotel/search")
public class SearchByCityController {

    @Autowired
    SearchHotelService searchHotelService;

    @GetMapping("/by_city/{city}")
    public ResponseEntity<Response> searchHotels(@PathVariable("city") String city) {
        try {
            ImpalaHotelDTO response = searchHotelService.searchHotels(null);
            List<HotelInfoDTO> hotelsByCityList = null;
            hotelsByCityList = new LinkedList<>();
            for (HotelInfoDTO hotel : response.getData()) {

                if (hotel.getAddress().getCity().equalsIgnoreCase(city)) {
                    hotelsByCityList.add(hotel);
                }

            }
            System.out.println("Total hotes based on city " + hotelsByCityList.size());
            return sendResponse(HttpStatus.OK.value(), "success", hotelsByCityList);
        } catch (CustomException e) {
            e.printStackTrace();
            return sendResponse(e.getStatus(), e.getMessage(), e.getResult());
        } catch (Exception e) {
            e.printStackTrace();
            return sendResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "failed", new ArrayList<>());
        }
    }


    private ResponseEntity<Response> sendResponse(Integer status, String message, Object result) {

        Response response = new Response();
        response.setStatus(status);
        response.setMessage(message);
        response.setResult(result);
        return new ResponseEntity<Response>(response, HttpStatus.OK);

    }
}
