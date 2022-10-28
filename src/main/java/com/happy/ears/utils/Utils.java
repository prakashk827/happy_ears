package com.happy.ears.utils;

import java.sql.Timestamp;

public class Utils {


    public static Timestamp GetCurrentTimeStamp() {
        java.util.Date date = new java.util.Date();
        return new Timestamp(date.getTime());
    }

}
