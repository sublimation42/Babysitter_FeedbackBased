/**
 * Created by Adam on 3/3/2017.
 */
public class PayEstimator {
    public static final int normalRate = 12;


    public int calculatePay(int hrs) {
        return hrs;
    }

    public int calcNormalPay(int start, int bed) {

        

        int totalNormHrs = bed - start;

        return totalNormHrs * normalRate;
    }
}
