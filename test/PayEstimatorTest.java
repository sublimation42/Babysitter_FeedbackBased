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
        assertEquals(12, p.calculatePay(17,99,18));
    }

    @Test
    public void AppointmentWithOneHourOvertimeNoBedtimeHoursReturnPay()
    {
        assertEquals(16, p.calculatePay(0,99,1));
    }

    @Test
    public void AppointmentWithOneHourOvertimeAndBedtimeHoursReturnPay()
    {
        assertEquals(36, p.calculatePay(22,23,1));
    }

    @Test
    public void AppointmentWithNoOvertimeReturnPay()
    {
        assertEquals(40, p.calculatePay(18,20,22));
    }


    @Test
    public void providedStartandBedTimeCalculateNormalPay()
    {
        assertEquals(12, p.calcNormalPay(17, 18));
    }

    @Test
    public void providedBedandEndTimeCalculateAsleepPay()
    {
        assertEquals(8, p.calcAsleepPay(21, 22));
    }

    @Test
    public void providedMidnightTimeCalculateOvertime()
    {
        assertEquals(16, p.calcOvertimePay (0, 1));
    }

    @Test
    public void appointmentIncludesOvertimeHoursHelperReturnBoolean()
    {
        assertEquals(true, p.isOvertime (18, 20, 1));
    }

    @Test
    public void appointmentDoesNotIncludesOvertimeHoursHelperReturnBoolean()
    {
        assertEquals(false, p.isOvertime (18, 20, 21));
    }

}