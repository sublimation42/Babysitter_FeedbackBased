/**
 * Created by Adam on 3/3/2017.
 */
public class PayEstimator {
    public static final int NORMALRATE = 12;
    public static final int BEDTIMERATE = 8;
    public static final int OVERTIMERATE = 16;


    public int calculatePay(int start, int bed, int end) {
        int totalPay = 0;

        if(isOvertime(start,bed,end) && bed == 99)
        {
            totalPay = calcOvertimePay(0,end);
        }
        else if(isOvertime(start,bed,end) )
        {
            totalPay = calcNormalPay(start,bed) + calcAsleepPay(bed,end) + calcOvertimePay(0, end);

        }
        else if (bed == 99)
        {
            totalPay = calcNormalPay(start,end);
        }
        else
        {
            totalPay = calcNormalPay(start,bed) + calcAsleepPay(bed,end);
        }




        return totalPay;
    }

    public int calcNormalPay(int start, int bed) {



        int totalNormHrs = bed - start;

        return totalNormHrs * NORMALRATE;
    }

    public int calcAsleepPay(int bed, int end) {
        int totalAsleepHrs;

        if(end < 4)
        {
            end = 24;
        }


            totalAsleepHrs = end - bed;





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
