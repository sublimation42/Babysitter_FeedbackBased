/**
 * Created by Adam on 3/3/2017.
 */
public class PayEstimator {
    public static final int NORMALRATE = 12;
    public static final int BEDTIMERATE = 8;
    public static final int OVERTIMERATE = 16;


    public int calculatePay(String start, String bed, String end) {

        int st = Integer.parseInt(start);
        int et = Integer.parseInt(end);


        if(bed.equalsIgnoreCase("na"))
        {
            int bt = 99;
        }
        else
        {
            int bt = Integer.parseInt(bed);
        }

        return 1;
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
