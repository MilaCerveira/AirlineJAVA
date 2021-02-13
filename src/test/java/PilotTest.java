import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    @Before
    public void setUp() {
       pilot = new Pilot("Mila", "007", "123");
    }
    @Test
    public void canFly(){
        assertEquals("I'm King of the world!", pilot.fly());
    }
}
