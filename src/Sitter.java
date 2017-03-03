import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Adam on 3/3/2017.
 */


public class Sitter {


    public static final SimpleDateFormat TWELVE = new SimpleDateFormat("hh:a");
    public static final SimpleDateFormat TWENTYFOUR = new SimpleDateFormat("HH");
    public static final int EARLIEST_START = 17;
    public static final int LATEST_END = 4;


    public String sitterGreeting(String incoming) {
        return "Hello I am Sitter2k.";
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

    public Boolean isBedTimeAcceptable(String bed) {
        return true;
    }

}
