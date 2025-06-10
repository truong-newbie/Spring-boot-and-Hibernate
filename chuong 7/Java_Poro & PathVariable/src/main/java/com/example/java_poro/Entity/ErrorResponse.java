package com.example.java_poro.Entity;

public class ErrorResponse {
    private int status;
    private String message;
    private long timstamp;

    public ErrorResponse(int status, String message) {
        this.message = message;
        this.status = status;
        this.timstamp = System.currentTimeMillis();
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

    public long getTimstamp() {
        return timstamp;
    }

    public void setTimstamp(long timstamp) {
        this.timstamp = timstamp;
    }
}
