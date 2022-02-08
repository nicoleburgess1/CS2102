import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {

    public Examples() {
    }

    Time time1 = new Time(5, 5);
    Time time2 = new Time(10, 10);
    Time time3 = new Time(15, 15);
    Reading re2a = new Reading(time1, 44.5, 32.0);
    Reading re2b = new Reading(time2, 57.0, 3.0);
    Reading re2c = new Reading(time3, 78.5, 61.0);

    Reading re3a = new Reading(time1, -55.0, 81.0);
    Reading re3b = new Reading(time2, -63.7, 15.0);
    Reading re3c = new Reading(time3, -1.3, 41.5);

    Reading re4a = new Reading(time1, 89.5, 14.7);
    Reading re4b = new Reading(time2, 56.5, 32.6);
    Reading re4c = new Reading(time3, -62.5, 15.1);

    Reading re5a = new Reading(time1, 0, 0);
    Reading re5b = new Reading(time2, 0, 0);
    Reading re5c = new Reading(time3, 0, 0);

    Reading re6a = new Reading(time1, -55.0, 5.0);
    Reading re6b = new Reading(time2, -10.5, 15.0);
    Reading re6c = new Reading(time3, -15.5, 25.0);

    Reading re7a = new Reading(time1, 55.5, 19.0);
    Reading re7b = new Reading(time2, 88.1, 7.0);
    Reading re7c = new Reading(time3, 95.4, 9.5);

    Reading re8a = new Reading(time1, 50.0, 5.0);
    Reading re8b = new Reading(time2, -25, 16.5);
    Reading re8c = new Reading(time3, 0.0, 13.5);

    LinkedList<Reading> readings1 = new LinkedList<>();
    LinkedList<Reading> readings2 = new LinkedList<>();
    LinkedList<Reading> readings3 = new LinkedList<>();
    LinkedList<Reading> readings4 = new LinkedList<>();
    LinkedList<Reading> readings5 = new LinkedList<>();
    LinkedList<Reading> readings6 = new LinkedList<>();
    LinkedList<Reading> readings7 = new LinkedList<>();
    LinkedList<Reading> readings8 = new LinkedList<>();

    @Before
    public void setUp() {
        readings2.add(re2a);
        readings2.add(re2b);
        readings2.add(re2c);

        readings3.add(re3a);
        readings3.add(re3b);
        readings3.add(re3c);

        readings4.add(re4a);
        readings4.add(re4b);
        readings4.add(re4c);

        readings5.add(re5a);
        readings5.add(re5b);
        readings5.add(re5c);

        readings6.add(re6a);
        readings6.add(re6b);
        readings6.add(re6c);

        readings7.add(re7a);
        readings7.add(re7b);
        readings7.add(re7c);

        readings8.add(re8a);
        readings8.add(re8b);
        readings8.add(re8c);
    }


    GregorianCalendar d1 = new GregorianCalendar(2020, 1, 1);
    GregorianCalendar d2 = new GregorianCalendar(2020, 1, 2);
    GregorianCalendar d3 = new GregorianCalendar(2020, 2, 1);
    GregorianCalendar d4 = new GregorianCalendar(2020, 2, 2);


    GregorianCalendar d5 = new GregorianCalendar(2019, 1, 1);
    GregorianCalendar d6 = new GregorianCalendar(2019, 1, 2);
    GregorianCalendar d7 = new GregorianCalendar(2019, 2, 1);
    GregorianCalendar d8 = new GregorianCalendar(2019, 2, 2);


    WeatherMonitor w1 = new WeatherMonitor(); //empty
    WeatherMonitor w2 = new WeatherMonitor(); //normal


    @Before
    public void setUp1() {
        w2.addDailyReport(d1, readings1);
        w2.addDailyReport(d2, readings2);
        w2.addDailyReport(d3, readings3);
        w2.addDailyReport(d4, readings4);
        w2.addDailyReport(d5, readings5);
        w2.addDailyReport(d6, readings6);
        w2.addDailyReport(d7, readings7);
        w2.addDailyReport(d8, readings8);
    }

    /*
     * tests for averageTempForMonth
     *
     * no daily reports in reports
     * can't find month/year
     * all right month and year
     * normal case (neg & pos temps)
     * normal case 2
     * all temps are 0
     */

    @Test
    public void testW1AvgTemp1() {
        assertEquals(0, w1.averageTempForMonth(1, 2020), .01);
    }









    /*
     * tests for totalRainfallForMonth
     *
     * no daily reports in reports
     * can't find month/year
     * all right month and year
     * total rainfall is 0
     * normal case
     * normal case 2
     */

    /*
     * tests for addDailyReport
     *
     * adding to empty reports
     *
     */
}