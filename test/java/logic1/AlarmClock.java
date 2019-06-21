package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlarmClock {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void alarm_clock_v01() {
        assertEquals("7:00", solution.alarmClock(1, false));
    }

    @Test
    public void alarm_clock_v02() {
        assertEquals("7:00", solution.alarmClock(5, false));
    }

    @Test
    public void alarm_clock_v03() {
        assertEquals("10:00", solution.alarmClock(0, false));
    }

    @Test
    public void alarm_clock_v04() {
        assertEquals("10:00", solution.alarmClock(6, false));
    }

    @Test
    public void alarm_clock_v05() {
        assertEquals("off", solution.alarmClock(0, true));
    }

    @Test
    public void alarm_clock_v06() {
        assertEquals("off", solution.alarmClock(6, true));
    }

    @Test
    public void alarm_clock_v07() {
        assertEquals("10:00", solution.alarmClock(1, true));
    }

    @Test
    public void alarm_clock_v08() {
        assertEquals("10:00", solution.alarmClock(3, true));
    }

    @Test
    public void alarm_clock_v09() {
        assertEquals("10:00", solution.alarmClock(5, true));
    }
}
