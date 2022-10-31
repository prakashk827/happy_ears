package com.happy.ears.login_register.controller;

import com.happy.ears.custom_exception.CustomException;
import com.happy.ears.dto.Response;
import com.happy.ears.hrbconstanst.HrbConstatns;
import com.happy.ears.login_register.dao.RegisterORLoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;
@RestController
public class RegisterORLoginController {

    @Autowired
    RegisterORLoginDao registerORLoginDao;

    @PostMapping("/validate_login")
    public Response loginValidation(@RequestBody Map<String, Object> requestMap) {
        try {

            Long mobileNumber =Long.valueOf(requestMap.get("mobile_number").toString()) ;
            System.out.println("Mobile number is " + mobileNumber );
            if (mobileNumber == null) {
                sendResponse(HttpStatus.BAD_REQUEST.value(), "Please enter valid mobile number", new ArrayList<>());
            }

            if (!registerORLoginDao.isMobileNumberExits(mobileNumber)) {
                System.out.println("Mobile number not exists");
                registerORLoginDao.insertMobileNumber(mobileNumber);
            }

            return sendResponse(HttpStatus.OK.value(), "success", mobileNumber);

        } catch (CustomException e) {
            return sendResponse(e.getStatus(), e.getMessage(), e.getResult());
        } catch (Exception e) {
            e.printStackTrace();
           return sendResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());
        }


    }

    private Response sendResponse(Integer status, String message, Object result) {

        Response response = new Response();
        response.setStatus(status);
        response.setMessage(message);
        response.setResult(result);
        return response;
    }

}
