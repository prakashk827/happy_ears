package com.hotel.booking.hrbexception;

public class HRBException extends RuntimeException {

    private Integer status;
    private String message;
    private Object result;


    public HRBException() {
        super();
    }

    public HRBException(Integer status, String message, Object result) {
        super();
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }


}
