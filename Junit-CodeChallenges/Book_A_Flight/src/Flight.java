//package com.model;

public class Flight {
    public int flightId;
    private String flightName;
    private String source, destination;
    private float flightFare;
    private int noOfSeats =40;
    static final String COMPANYNAME = "Aviva Airlines";
    
    public Flight(int flightId, String flightName, String source, String destination, float flightFare, int noOfSeats) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.flightFare = flightFare;
        this.noOfSeats = noOfSeats;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getFlightFare() {
        return flightFare;
    }

    public void setFlightFare(float flightFare) {
        this.flightFare = flightFare;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public static String getCompanyname() {
        return COMPANYNAME;
    }

    
}
