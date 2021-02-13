import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Alex", CabinCrewMemberRank.FIRST_OFFICER);
    }

    @Test
    public void canRelayMessage(){
        assertEquals("This is your cabin crew speaking", cabinCrewMember.relayMessage());
    }
}
