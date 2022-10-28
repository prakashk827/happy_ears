package com.happy.ears.products.controller;

import com.happy.ears.custom_exception.CustomException;
import com.happy.ears.dto.Response;
import com.happy.ears.hrbconstanst.HrbConstatns;
import com.happy.ears.products.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@RestController
public class HomePageController {

    @Autowired
    ProductDao productDao;

    Map<String, Object> productList = new LinkedHashMap<>();

    @GetMapping("/home")
    public Map<String, Object> homePage() {
        Response topSellingProducts = null;
        try {
            List<Map<String, Object>> productsList = productDao.getTopSellingItems();
            topSellingProducts = sendResponse(HttpStatus.OK.value(), "success", productsList);
        } catch (CustomException e) {
            topSellingProducts = sendResponse(e.getStatus(), e.getMessage(), e.getResult());
        } catch (Exception e) {
            topSellingProducts = sendResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());
        }
        productList.put("top_selling_products", topSellingProducts);

        return productList;
    }


    private Response sendResponse(Integer status, String message, Object result) {

        Response response = new Response();
        response.setStatus(status);
        response.setMessage(message);
        response.setResult(result);
        return response;
    }


}
