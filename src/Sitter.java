import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Adam Howard on 3/3/2017.
 */


public class Sitter {


    public static final SimpleDateFormat TWELVE = new SimpleDateFormat("hh:a");
    public static final SimpleDateFormat TWENTYFOUR = new SimpleDateFormat("HH");
    public static final int EARLIEST_START = 17;
    public static final int LATEST_END = 4;


    public String bookAppointment(String start, String bed, String end) {

        String message = "Hello I am Sitter2k. ";

        if (isStartTimeAcceptable(start) && isBedTimeAcceptable(start, bed, end) && isEndTimeAcceptable(end))
        {
            message =  message + "Your appointment has been successfully booked.";
        }



        return message;
    }

    public Boolean isStartTimeAcceptable(String start){



        int startHour = convertStartTime(start);





       if(startHour >= EARLIEST_START || startHour <= LATEST_END)
        {
            return true;
        }

        return false;

    }

    public Boolean isEndTimeAcceptable(String end){

        int endHour = convertEndTime(end);


        if(endHour <= LATEST_END || endHour > 17)
        {
            return true;
        }

        return false;
    }

    public Boolean isBedTimeAcceptable(String start, String bed, String end) {
        int sHour = convertStartTime(start);
        int bHour = convertBedTime(bed);
        int eHour = convertEndTime(end);


        if(bHour > 4)
        {
            if (sHour < bHour && bHour < eHour)
            {
                return true;
            }
        }

        if (bHour <= 4 && isStartTimeAcceptable(start) == Boolean.TRUE)
        {
            return true;
        }
        return false;
    }

    public int convertStartTime(String s) {

        int cStart = 0;
        try {
            cStart = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(s)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return cStart;

    }

    public int convertBedTime(String b) {

        int cBed = 0;

        try {
            cBed = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(b)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return cBed;


    }

    public int convertEndTime(String end) {

        int cEnd = 0;

        try {
            cEnd = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(end)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return cEnd;
    }
}
