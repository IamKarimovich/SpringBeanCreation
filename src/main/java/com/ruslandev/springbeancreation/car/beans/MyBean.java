package com.ruslandev.springbeancreation.car.beans;

public class MyBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    private void showMessage() {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
