import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 03/03/2017.
 */
public class PayEstimatorTest {

    PayEstimator p;

    @Before
    public void setUp()
    {
        p = new PayEstimator();
    }

    @Test
    public void shortAppointmentNoOvertimeorBedtimeHoursReturnPay()
    {



        assertEquals(1, p.calculatePay("17","NA","18"));

    }

    @Test
    public void providedStartandBedTimeCalculateNormalPay()
    {
        assertEquals(12, p.calcNormalPay(5, 6));
    }

    @Test
    public void providedBedandEndTimeCalculateAsleepPay()
    {
        assertEquals(8, p.calcAsleepPay(9, 10));
    }

    @Test
    public void providedMidnightTimeCalculateOvertime()
    {
        assertEquals(16, p.calcOvertimePay (0, 1));
    }

    @Test
    public void appointmentIncludesOvertimeHoursHelperReturnBoolean()
    {
        assertEquals(true, p.isOvertime ("18", "20", "1"));
    }

    @Test
    public void appointmentDoesNotIncludesOvertimeHoursHelperReturnBoolean()
    {
        assertEquals(false, p.isOvertime ("18", "20", "21"));
    }

}