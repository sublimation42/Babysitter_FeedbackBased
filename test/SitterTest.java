import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 03/03/2017.
 */
public class SitterTest {

    Sitter a;

    @Before
    public void setUp()
    {
        a = new Sitter();
    }

    @Test
    public void givenHelloStringInputDoesSitterReturnGreeting()
    {



       assertEquals("Hello I am Sitter2k.", a.sitterGreeting("Hello")) ;

    }

    @Test
    public void sitterAcceptsEarliestStartTime()
    {
        assertEquals(true, a.isStartTimeAcceptable("5:PM"));

    }


}