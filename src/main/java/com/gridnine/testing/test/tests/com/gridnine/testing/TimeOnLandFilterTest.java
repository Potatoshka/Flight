package com.gridnine.testing.test.tests.com.gridnine.testing;

import com.gridnine.testing.BaseTestingClass;
import com.gridnine.testing.TimeOnLandFilter;
import org.junit.Assert;
import org.junit.Test;

public class TimeOnLandFilterTest extends BaseTestingClass {
    @Test
    public void test() {
        Assert.assertTrue(new TimeOnLandFilter().validation(normalFlight()));
        Assert.assertTrue(new TimeOnLandFilter().validation(departurePastFlight()));
        Assert.assertTrue(new TimeOnLandFilter().validation(arriveBeforeDeparture()));
        Assert.assertTrue(new TimeOnLandFilter().validation(normalMultiFlight()));
        Assert.assertFalse(new TimeOnLandFilter().validation(moreThan2HoursMultiFlight()));
        Assert.assertFalse(new TimeOnLandFilter().validation(moreThan3HoursMultiFlight()));

    }
}
