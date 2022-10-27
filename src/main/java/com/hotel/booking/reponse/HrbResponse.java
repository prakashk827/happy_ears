package com.hotel.booking.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HrbResponse {

    @JsonProperty("message")
    private String message;

    @JsonProperty("statusCode")
    private Integer statusCode;

    @JsonProperty("response")
    private Object response;

    public HrbResponse() {
    }

    public HrbResponse(String message) {
        this.message = message;
    }

    public HrbResponse(Object response) {
        this.response = response;
    }

    public HrbResponse(String message, Integer statusCode, Object response) {
        this.message = message;
        this.statusCode = statusCode;
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "HrbResponse{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                ", response=" + response +
                '}';
    }
}
