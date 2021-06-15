//package com.dao;
/*
import com.exception.InvalidFlightException;
import com.model.Flight;
*/
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    List<Flight> flightList = new ArrayList<>();

    public void addCourse(Flight flightObj) {
        flightList.add(flightObj);
    }

    public List<Flight> viewFlightBySourceDestination(String source, String desination) throws InvalidFlightException {
        List<Flight> temp = new ArrayList<>();
        for (Flight fObj : flightList) {
            if (f.getSource().equals(source) && f.getDestination().equals(desination)) {
                temp.add(f);
            }
        }
        if (temp.isEmpty()) {
            throw new InvalidFlightException("No Flight with source " + source + " and destination " + desination);
        } else
            return temp;
    }
}
