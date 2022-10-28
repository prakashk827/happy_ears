package com.happy.ears.impala.hotels.service;

import com.happy.ears.hrbconstanst.HrbConstatns;
import com.happy.ears.custom_exception.CustomException;

import com.happy.ears.impala.hotels.dto.ImpalaHotelDTO;
import com.happy.ears.utils.EncodeURL;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;


@Service
public class SearchHotelService {

    //private static final Logger APP_LOG = LoggerFactory.getLogger(SearchHotelService.class);

    private String URL = "https://sandbox.impala.travel/v1/hotels";

    public ImpalaHotelDTO searchHotels(Map<String, String> requestParamMap) {

        RestTemplate restTemplate = null;
        restTemplate = new RestTemplate();
        ImpalaHotelDTO response = null;
        Map<String, Object> requestBody = new LinkedHashMap<>();

        URL = EncodeURL.encodeURL(URL, requestParamMap);


        System.out.println("URL is  " + URL);
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, "application/json");
        //headers.set(HttpHeaders.CONTENT_TYPE, "application/json");
        headers.set("x-api-key", "sandb_Msb5KWYV5a9PUbyhsG7kzHeGXDIhe7TVxeKEuUYo");
        final HttpEntity<?> entity = new HttpEntity<>(requestBody, headers);

        try {

            response = restTemplate.exchange(URL, HttpMethod.GET, entity, ImpalaHotelDTO.class).getBody();
            System.out.println("Total hotels " + response.getData().size());
            return response;

        } catch (HttpServerErrorException e) {
            //APP_LOG.info("Something went wrong HttpServerErrorException callDigitapAPI():  " + e);
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HrbConstatns.SOMETHING_WENT_WRONG, new ArrayList<>());

        } catch (HttpClientErrorException e) {
            //APP_LOG.info("Something went wrong HttpClientErrorException callDigitapAPI():  " + e);
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getResponseBodyAsString(), new ArrayList<>());

        } catch (RestClientException e) {
            //APP_LOG.info("Something went wrong RestClientException callDigitapAPI():  " + e);
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), new ArrayList<>());

        } catch (Exception e) {
            //APP_LOG.info("Something went wrong Exception callDigitapAPI():  " + e);
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), new ArrayList<>());
        }

    }

    private String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }
}
