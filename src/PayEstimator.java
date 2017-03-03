/**
 * Created by Adam on 3/3/2017.
 */
public class PayEstimator {
    public static final int normalRate = 12;
    public static final int bedtimeRate = 8;


    public int calculatePay(int hrs) {
        return hrs;
    }

    public int calcNormalPay(int start, int bed) {



        int totalNormHrs = bed - start;

        return totalNormHrs * normalRate;
    }

    public int calcAsleepPay(int bed, int end) {

        int totalAsleepHrs = end - bed;

        return totalAsleepHrs * bedtimeRate;
    }
}
