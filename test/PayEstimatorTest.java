import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 03/03/2017.
 */
public class PayEstimatorTest {

    PayEstimator p;

    @Before
    public void setUp()
    {
        p = new PayEstimator();
    }

    @Test
    public void givenHoursREturnPay()
    {



        assertEquals(1, p.calculatePay(1));

    }

}