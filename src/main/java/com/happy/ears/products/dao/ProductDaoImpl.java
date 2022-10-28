package com.happy.ears.products.dao;

import com.happy.ears.custom_exception.CustomException;
import com.happy.ears.hrbconstanst.HrbConstatns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Map<String, Object>> getProductList() {

        String SQL = "SELECT product_id,product_name,short_description,main_image_url,in_stock,mrp_price,selling_price" +
                " FROM products ORDER BY product_id DESC";


        try {
            SqlParameterSource parameterSource = new MapSqlParameterSource();
            return namedParameterJdbcTemplate.queryForList(SQL, parameterSource);
        } catch (EmptyResultDataAccessException e) {
            e.printStackTrace();
            throw new CustomException(HttpStatus.NOT_FOUND.value(), "No Products found", new ArrayList<>());
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());
        }


    }

    @Override
    public List<Map<String, Object>> getTopSellingItems() {
        String SQL = "SELECT product_id,product_name,short_description,main_image_url,in_stock,mrp_price,selling_price,items_sold " +
                " FROM products ORDER BY items_sold DESC LIMIT 4";


        try {
            SqlParameterSource parameterSource = new MapSqlParameterSource();
            return namedParameterJdbcTemplate.queryForList(SQL, parameterSource);
        } catch (EmptyResultDataAccessException e) {
            e.printStackTrace();
            throw new CustomException(HttpStatus.NOT_FOUND.value(), "No Products found", new ArrayList<>());
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());
        }
    }
}
