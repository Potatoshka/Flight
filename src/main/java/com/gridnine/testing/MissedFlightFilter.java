package com.gridnine.testing;

import java.time.LocalDateTime;

//A flight departing in the past filter

public class MissedFlightFilter implements FilterInterface {

    @Override
    public boolean validation(Flight flight) {

        for (Segment segment : flight.getSegments()) {
            if (segment.getDepartureDate().isBefore(LocalDateTime.now())) {
                return false;
            }
        }
        return true;
    }

}
