package com.hotel.booking.utils;

import com.hotel.booking.hrbconstanst.HrbConstatns;
import com.hotel.booking.hrbexception.HRBException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;

import static java.util.stream.Collectors.joining;

@Component
public class EncodeURL {


    public static String encodeURL(String URL, Map<String, String> requestParamMap) {

        if (requestParamMap == null || requestParamMap.isEmpty()) {
            return URL;
        } else {
            return requestParamMap.keySet().stream()
                    .map(key -> key + "=" + encode(requestParamMap.get(key)))
                    .collect(joining("&", URL + "?", ""));
        }


    }

    private static String encode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (Exception e) {
            throw new HRBException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());
        }

    }
}
