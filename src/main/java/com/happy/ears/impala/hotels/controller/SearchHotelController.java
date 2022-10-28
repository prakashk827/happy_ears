package com.happy.ears.impala.hotels.controller;

import com.happy.ears.impala.hotels.service.SearchHotelService;
import com.happy.ears.dto.Response;
import com.happy.ears.custom_exception.CustomException;
import com.happy.ears.impala.hotels.dto.ImpalaHotelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/hotel/search")
public class SearchHotelController {

    @Autowired
    SearchHotelService searchHotelService;

    @PostMapping("/")
    public ResponseEntity<Response> searchHotels(@RequestBody Map<String,String> requestParamMap ) {
        try {
            ImpalaHotelDTO response = searchHotelService.searchHotels(requestParamMap);
            return sendResponse(HttpStatus.OK.value(), "success", response);
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
