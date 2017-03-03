/**
 * Created by Adam on 3/3/2017.
 */


public class Sitter {

    public static final String EarliestStart = "5PM";


    public String sitterGreeting(String incoming) {
        return "Hello I am Sitter2k.";
    }

    public Boolean isStartTimeAcceptable(String start){

        String[] startTime = start.split(":");
        int startHour = Integer.parseInt(startTime[0]);
        String startPeriod = startTime[1];



        if(startHour < 5 && startPeriod.equalsIgnoreCase("pm"))
        {
            return false;
        }

        if((startHour >= 4 && startHour <12) && startPeriod.equalsIgnoreCase("am"))
        {
            return false;
        }
        return true;

    }

    public Boolean isEndTimeAcceptable(String end){
        return true;
    }
}
