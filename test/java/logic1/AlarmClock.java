package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlarmClock {

    @Test
    public void alarm_clock_v01(){
        Solution solution = new Solution();
        assertEquals("7:00", solution.alarmClock(1, false));
    }

    @Test
    public void alarm_clock_v02(){
        Solution solution = new Solution();
        assertEquals("7:00", solution.alarmClock(5, false));
    }

    @Test
    public void alarm_clock_v03(){
        Solution solution = new Solution();
        assertEquals("10:00", solution.alarmClock(0, false));
    }

    @Test
    public void alarm_clock_v04(){
        Solution solution = new Solution();
        assertEquals("10:00", solution.alarmClock(6, false));
    }

    @Test
    public void alarm_clock_v05(){
        Solution solution = new Solution();
        assertEquals("off", solution.alarmClock(0, true));
    }

    @Test
    public void alarm_clock_v06(){
        Solution solution = new Solution();
        assertEquals("off", solution.alarmClock(6, true));
    }

    @Test
    public void alarm_clock_v07(){
        Solution solution = new Solution();
        assertEquals("10:00", solution.alarmClock(1, true));
    }

    @Test
    public void alarm_clock_v08(){
        Solution solution = new Solution();
        assertEquals("10:00", solution.alarmClock(3, true));
    }

    @Test
    public void alarm_clock_v09(){
        Solution solution = new Solution();
        assertEquals("10:00", solution.alarmClock(5, true));
    }
}
