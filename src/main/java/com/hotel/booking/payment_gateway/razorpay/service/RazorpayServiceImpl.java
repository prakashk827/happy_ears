package com.hotel.booking.payment_gateway.razorpay.service;

import com.hotel.booking.hrbexception.HRBException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RazorpayServiceImpl implements RazorpayService {

    @Override
    public void exceptionThrowExample() {
        String msg = "error";

        if (msg.equalsIgnoreCase("error")) {

            throw new HRBException(HttpStatus.BAD_REQUEST.value(), "Failed", new ArrayList<>());
        }
    }
}
