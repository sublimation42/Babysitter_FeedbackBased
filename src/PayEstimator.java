/**
 * Created by Adam on 3/3/2017.
 */
public class PayEstimator {
    public static final int NORMALRATE = 12;
    public static final int BEDTIMERATE = 8;
    public static final int OVERTIMERATE = 16;


    public int calculatePay(String start, String bed, String end) {
        int totalPay = 0;

        int st = Integer.parseInt(start);
        int et = Integer.parseInt(end);
        int bt;


        if(bed.equalsIgnoreCase("na"))
        {
            bt = 99;
        }
        else
        {
            bt = Integer.parseInt(bed);
        }



        if(isOvertime(st,bt,et) && bt == 99)
        {
            totalPay = calcOvertimePay(0,et);
        }
        else if(isOvertime(st,bt,et) )
        {
            //do something
        }
        else if (bt == 99)
        {
            totalPay = calcNormalPay(st,et);
        }
        else
        {
            //do something else
        }




        return totalPay;
    }

    public int calcNormalPay(int start, int bed) {



        int totalNormHrs = bed - start;

        return totalNormHrs * NORMALRATE;
    }

    public int calcAsleepPay(int bed, int end) {

        int totalAsleepHrs = end - bed;

        return totalAsleepHrs * BEDTIMERATE;
    }

    public int calcOvertimePay(int i, int end) {

        int totalOvertimeHrs = end - i;

        return totalOvertimeHrs * OVERTIMERATE;
    }

    public boolean isOvertime(int start, int bed, int end) {

        if(bed < 4 || end < 4)
        {
            return true;
        }
        return false;
    }
}
