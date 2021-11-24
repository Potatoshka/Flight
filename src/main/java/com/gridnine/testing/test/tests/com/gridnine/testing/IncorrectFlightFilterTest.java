package com.gridnine.testing.test.tests.com.gridnine.testing;

import com.gridnine.testing.BaseTestingClass;
import com.gridnine.testing.IncorrectFlight;
import org.junit.Assert;
import org.junit.Test;

public class IncorrectFlightFilterTest extends BaseTestingClass {
    @Test
    public void test() {
        Assert.assertTrue(new IncorrectFlight().validation(normalFlight()));
        Assert.assertTrue(new IncorrectFlight().validation(departurePastFlight()));
        Assert.assertFalse(new IncorrectFlight().validation(arriveBeforeDeparture()));
        Assert.assertTrue(new IncorrectFlight().validation(normalMultiFlight()));
        Assert.assertTrue(new IncorrectFlight().validation(moreThan2HoursMultiFlight()));
        Assert.assertTrue(new IncorrectFlight().validation(moreThan3HoursMultiFlight()));

    }
}
