package com.happy.ears.products.dao;

import java.util.List;
import java.util.Map;

public interface ProductDao {

    List<Map<String, Object>> getProductList();

    List<Map<String, Object>> getTopSellingItems();
}
