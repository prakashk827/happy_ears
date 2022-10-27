package com.hotel.booking.test;

import com.hotel.booking.dto.Response;
import com.hotel.booking.hrbexception.HRBException;
import com.hotel.booking.payment_gateway.razorpay.service.RazorpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {

    @Autowired
    RazorpayService razorpayService;

    @GetMapping("/booking/test")
    public ResponseEntity<Response> test() {

        try {
            razorpayService.exceptionThrowExample();
            return sendResponse(HttpStatus.OK.value(), "Success", "Ram");
        } catch (HRBException e) {
            return sendResponse(HttpStatus.BAD_REQUEST.value(), "HRB Exception", new ArrayList<>());
        } catch (Exception e) {
            return sendResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Something went wrong", new ArrayList<>());
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
