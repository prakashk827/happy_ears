package com.happy.ears.test;

import com.happy.ears.dto.Response;
import com.happy.ears.custom_exception.CustomException;
import com.happy.ears.payment_gateway.razorpay.service.RazorpayService;
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
        } catch (CustomException e) {
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
