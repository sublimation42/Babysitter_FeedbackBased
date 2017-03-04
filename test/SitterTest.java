import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 03/03/2017.
 */
public class SitterTest {

    Sitter a;

    @Before
    public void setUp()
    {
        a = new Sitter();
    }

    @Test
    public void givenStartBedandEndTimesBookApointment()
    {



       assertEquals("Hello I am Sitter2k. Your appointment has been successfully booked.", a.bookAppointment("5:PM", "8:PM", "10:PM")) ;

    }

    @Test
    public void sitterAcceptsEarliestStartTime()
    {
        assertEquals(true, a.isStartTimeAcceptable("5:PM"));

    }

    @Test
    public void sitterRejectsStartTimeOneHourTooEarly()
    {
        assertEquals(false, a.isStartTimeAcceptable("4:PM"));

    }

    @Test
    public void sitterRejectsStartTimeBetween4AMandNoon()
    {
        assertEquals(false, a.isStartTimeAcceptable("11:AM"));

    }

    @Test
    public void sitterAcceptsLatestEndTime()
    {
        assertEquals(true, a.isEndTimeAcceptable("4:AM"));

    }

    @Test
    public void sitterAcceptsEndTimeThreeAM()
    {
        assertEquals(true, a.isEndTimeAcceptable("3:AM"));


    }

    @Test
    public void sitterAcceptsEndTimeSixPM()
    {
        assertEquals(true, a.isEndTimeAcceptable("6:PM"));


    }

    @Test
    public void sitterAcceptsEndTimeMidnight()
    {
        assertEquals(true, a.isEndTimeAcceptable("12:AM"));

    }

    @Test
    public void sitterRejectedEndTimeFiveAM()
    {
        assertEquals(false, a.isEndTimeAcceptable("5:AM"));

    }


    @Test
    public void sitterAcceptsBedtime()
    {
        assertEquals(true, a.isBedTimeAcceptable("6:PM", "12:AM", "1:AM"));
    }

    @Test
    public void sitterRejectsOutofBoundsBedTime()
    {
        assertEquals(false, a.isBedTimeAcceptable("6:PM", "12:PM", "1:AM"));
    }

    @Test
    public void convertStartTimeTo24()
    {
        assertEquals(17, a.convertStartTime("5:PM"));

    }



}