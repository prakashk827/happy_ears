package com.happy.ears.login_register.dao;

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

@Component
public class RegisterORLoginDaoImpl implements RegisterORLoginDao {
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public boolean isMobileNumberExits(Long mobileNumber) {
        String SQL = "SELECT COUNT(mobile_number) FROM user_profiles WHERE (mobile_number =:mobileNumber AND is_active = 1) ORDER BY user_id";
        Integer mobileNumCount;
        try {
            SqlParameterSource parameterSource = new MapSqlParameterSource()
                    .addValue("mobileNumber", mobileNumber);
            mobileNumCount = namedParameterJdbcTemplate.queryForObject(SQL, parameterSource, Integer.class);
            System.out.println("Mobile Count " + mobileNumCount);
        } catch (EmptyResultDataAccessException e) {
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG , new ArrayList<>());
        }
        if (mobileNumCount > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void insertMobileNumber(Long mobileNumber) {
        String SQL = "INSERT INTO user_profiles (mobile_number) VALUES(:mobileNumber)";
        try {
            SqlParameterSource parameterSource = new MapSqlParameterSource()
                    .addValue("mobileNumber", mobileNumber);
            namedParameterJdbcTemplate.update(SQL, parameterSource);

        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());
        }
    }
}
