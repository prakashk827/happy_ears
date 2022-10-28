package com.happy.ears.payment_gateway.razorpay.service;

import com.happy.ears.custom_exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RazorpayServiceImpl implements RazorpayService {

    @Override
    public void exceptionThrowExample() {
        String msg = "error";

        if (msg.equalsIgnoreCase("error")) {

            throw new CustomException(HttpStatus.BAD_REQUEST.value(), "Failed", new ArrayList<>());
        }
    }
}
