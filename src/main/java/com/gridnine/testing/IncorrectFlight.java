package com.gridnine.testing;

//A flight that departs before it arrives filter

public class IncorrectFlight implements FilterInterface {

    @Override
    public boolean validation(Flight flight) {
        for (Segment segment : flight.getSegments()) {
            if (segment.getArrivalDate().isBefore(segment.getDepartureDate())) {
                return false;
            }
        }
        return true;
    }
}
