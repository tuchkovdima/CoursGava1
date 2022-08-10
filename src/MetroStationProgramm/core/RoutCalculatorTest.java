/**package MetroStationProgramm.core;

import MetroStationProgramm.Station;
import org.json.simple.Test;

import java.util.ArrayList;
import java.util.List;

public class RoutCalculatorTest extends TestCase {
    List<Station> rote;

    protected void setUp() throws Exception{
        rote = new ArrayList<>();

        Line line1 = new Line(1,"First");
        Line line2 = new Line(2,"Second");

        rote.add(new Station("Petrovsk", line1));
        rote.add(new Station("1", line1));
        rote.add(new Station("2", line1));
        rote.add(new Station("3", line1));
        rote.add(new Station("4", line1));
    }
    public void testcalculateDuration(){
        double actual = RoutCalculatorTest.calculateDuration(rote);
        double expected = 8.5;
        assertEquals(expected,actual);
    }

}

 *
 */

