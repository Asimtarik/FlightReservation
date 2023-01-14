package com.mycompany.flightreservation;

public class Destination {

    private String cityName;
    private int additionalPayment;

    public String getCityName() {
        return cityName;
    }

    public int getAdditionalPayment() {
        return additionalPayment;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setAdditionalPayment(int additionalPayment) {
        this.additionalPayment = additionalPayment;
    }
}
