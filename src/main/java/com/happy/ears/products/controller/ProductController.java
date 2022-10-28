package com.happy.ears.products.controller;

import com.happy.ears.custom_exception.CustomException;
import com.happy.ears.dto.Response;
import com.happy.ears.hrbconstanst.HrbConstatns;
import com.happy.ears.products.dao.ProductDao;
import com.happy.ears.products.repository.ProductRepository;
import com.happy.ears.products.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductDao productDao;

    @PostMapping("/add")
    public ProductEntity addProduct(@RequestBody ProductEntity productEntity) {

        try {
            System.out.println(productEntity);
            ProductEntity product = productRepository.save(productEntity);
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @GetMapping("/list")
    public Response productList() {
        try {
            List<Map<String, Object>> productsList = productDao.getProductList();
            return sendResponse(HttpStatus.OK.value(), "success", productsList);
        } catch (CustomException e) {
            return sendResponse(e.getStatus(), e.getMessage(), e.getResult());
        } catch (Exception e) {
            return sendResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());
        }

    }

    @GetMapping("/top-selling-items")
    public Response topSellingItems() {
        try {
            List<Map<String, Object>> productsList = productDao.getTopSellingItems();
            return sendResponse(HttpStatus.OK.value(), "success", productsList);
        } catch (CustomException e) {
            return sendResponse(e.getStatus(), e.getMessage(), e.getResult());
        } catch (Exception e) {
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
