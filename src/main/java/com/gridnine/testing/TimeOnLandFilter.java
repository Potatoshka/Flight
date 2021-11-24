package com.gridnine.testing;

import java.time.Duration;
import java.util.List;

//A flight with more than two hours ground time filter

public class TimeOnLandFilter implements FilterInterface{
    @Override
    public boolean validation(Flight flight) {
        List<Segment> segments=flight.getSegments();
        long timeToWait=0;
        for(int i=1;i<segments.size();i++){
            timeToWait+=Duration.between(segments.get(i-1).getArrivalDate(),segments.get(i).getDepartureDate()).toSeconds();

        if(timeToWait>7200){
            return false;
        }
        }
        return true;
    }
}

