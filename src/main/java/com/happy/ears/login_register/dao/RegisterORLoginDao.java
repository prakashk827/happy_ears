package com.happy.ears.login_register.dao;

public interface RegisterORLoginDao {
    boolean isMobileNumberExits(Long mobileNumber);

    void insertMobileNumber(Long mobileNumber);
}
