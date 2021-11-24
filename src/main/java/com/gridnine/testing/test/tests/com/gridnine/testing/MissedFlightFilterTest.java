package com.gridnine.testing.test.tests.com.gridnine.testing;

import com.gridnine.testing.MissedFlightFilter;
import org.junit.Assert;
import org.junit.Test;

public class MissedFlightFilterTest extends com.gridnine.testing.BaseTestingClass {
    @Test
    public void test(){
        Assert.assertTrue(new MissedFlightFilter().validation(normalFlight()));
        Assert.assertFalse(new MissedFlightFilter().validation(departurePastFlight()));
        Assert.assertTrue(new MissedFlightFilter().validation(arriveBeforeDeparture()));
        Assert.assertTrue(new MissedFlightFilter().validation(normalMultiFlight()));
        Assert.assertTrue(new MissedFlightFilter().validation(moreThan2HoursMultiFlight()));
        Assert.assertTrue(new MissedFlightFilter().validation(moreThan3HoursMultiFlight()));







    }
}
