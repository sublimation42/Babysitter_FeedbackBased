/**
 * Created by Adam on 3/3/2017.
 */
public class PayEstimator {
    public static final int NORMALRATE = 12;
    public static final int BEDTIMERATE = 8;
    public static final int OVERTIMERATE = 16;


    public int calculatePay(int hrs) {
        return hrs;
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

        return OVERTIMERATE;
    }
}
