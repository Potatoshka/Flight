package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BaseTestingClass {
    private static Flight createFlight(final LocalDateTime... dates) {
        if ((dates.length % 2) != 0) {
            throw new IllegalArgumentException(
                    "you must pass an even number of dates");
        }
        List<Segment> segments = new ArrayList<>(dates.length / 2);
        for (int i = 0; i < (dates.length - 1); i += 2) {
            segments.add(new Segment(dates[i], dates[i + 1]));
        }
        return new Flight(segments);
    }

    public static Flight normalFlight(){
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
      return   createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2));
    }

    public static Flight departurePastFlight(){
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        return createFlight(threeDaysFromNow.minusDays(6), threeDaysFromNow);
    }

    public static Flight arriveBeforeDeparture(){
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        return createFlight(threeDaysFromNow, threeDaysFromNow.minusHours(6));
    }
    public static Flight normalMultiFlight(){
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        return createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2),
                threeDaysFromNow.plusHours(3), threeDaysFromNow.plusHours(5));
    }
    public static Flight moreThan2HoursMultiFlight(){
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        return createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2),
                threeDaysFromNow.plusHours(5), threeDaysFromNow.plusHours(6));
    }

    public static Flight moreThan3HoursMultiFlight(){
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        return createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2),
                threeDaysFromNow.plusHours(3), threeDaysFromNow.plusHours(4),
                threeDaysFromNow.plusHours(6), threeDaysFromNow.plusHours(7));
    }


}
