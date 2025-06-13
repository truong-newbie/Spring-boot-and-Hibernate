package com.example.crud_api.handle;

public class ErrorResponse {
    private String message;
    private int status;
    private Long timeStamp;

    public ErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
        this.timeStamp = System.currentTimeMillis();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
