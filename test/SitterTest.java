import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Howard on 03/03/2017.
 */
public class SitterTest {

    @Test
    public void TestSitterGreeting()
    {

        Sitter a = new Sitter();

       assertEquals("Hello I am Sitter2k.", a.sitterGreeting("Hello")) ;

    }


}