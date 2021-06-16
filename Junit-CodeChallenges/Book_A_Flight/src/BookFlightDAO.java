package com.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*
import exception.com.exception.InvalidFlightException;
import model.com.model.BookFlight;
import model.com.model.Customer;
import model.com.model.Flight;
*/
public class BookFlightDAO {
    List<BookFlight> bookFlightList = new ArrayList<>();

    public boolean bookAFlight(final Customer customer, final Flight flight, final LocalDate dateOfBooking, LocalDate flightDate, int noOfPassengers)
    {
        BookFlight bookObj = new BookFlight(customer,flight,dateOfBooking,flightDate,noOfPassengers);
        return bookingList.add(bookObj);
    }

    public List<BookFlight> viewBookingByFlight(Flight flightObj) throws InvalidFlightException
    {
        final List<BookFlight> temp = new ArrayList<>();
        for(final BookFlight booking : bookingList)
        {
            if(booking.getFlight().getFlightId() == flightObj.getFlightId())
            temp.add(booking);
        }
        if(temp.isEmpty())
        {
            throw new InvalidFlightException("No Booking for Flight "+flightObj.getFlightId());
        }
        return temp;
    }
}
