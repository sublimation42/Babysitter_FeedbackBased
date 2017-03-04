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



        return "Hello I am Sitter2k. Your appointment has been successfully booked.";
    }

    public Boolean isStartTimeAcceptable(String start){



        int startHour = 0;



        try {
            startHour = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(start)));
        } catch (ParseException e) {
            e.printStackTrace();
        }


       if(startHour >= EARLIEST_START || startHour <= LATEST_END)
        {
            return true;
        }

        return false;

    }

    public Boolean isEndTimeAcceptable(String end){
        int endHour = 0;



        try {
            endHour = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(end)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(endHour <= LATEST_END || endHour > 17)
        {
            return true;
        }

        return false;
    }

    public Boolean isBedTimeAcceptable(String start, String bed, String end) {
        int sHour = 0;
        int bHour = 0;
        int eHour = 0;

        try {
            sHour = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(start)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            bHour = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(bed)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            eHour = Integer.parseInt(TWENTYFOUR.format(TWELVE.parse(end)));
        } catch (ParseException e) {
            e.printStackTrace();
        }



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
}
