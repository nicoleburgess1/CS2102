import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
    private IWeather reports;
    //private LinkedList<DailyWeatherReport> reports = new LinkedList<>();

    public WeatherMonitor(){
        reports = new LLWeather();
    }


    /**
     * calculates the average temperature of a month
     * @param month the month to take the avg temp of
     * @param year the year of the month to take the avg temp of
     * @return avg of all temp data for reports that are in the given month and year
     */
    public double averageTempForMonth(int month, int year){
        return reports.avgTempForMonth(month, year);
    }

    /*
    totalRainfallForMonth, which takes a month (designated by a number such as 0 for January,
    1 for February, etc) and a year and produces the total rainfall over all days that month.*
     */

    /**
     * calculates the total rainfall during a month
     * @param month the month to find the total rainfall of
     * @param year the year of the month to find the total rainfall of
     * @return sum of all rainfall data for reports that are in the given month and year
     */
    public double totalRainfallForMonth(int month, int year){
        return reports.totalRainForMonth(month, year);
    }

    /*
    consumes a date and a list of readings (nominally for that date) and stores a daily report
    for the given date
     */

    /**
     * stores a daily report in reports
     * @param date date corresponding to the list of readings
     * @param readings linked list of Readings data
     */
    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
        LinkedList<Double> temps = new LinkedList<>();
        LinkedList<Double> rainfalls = new LinkedList<>();
        for(Reading reading: readings){
            temps.add(reading.getTemp());
            rainfalls.add(reading.getRainfall());
        }
        DailyWeatherReport r = new DailyWeatherReport(date, temps, rainfalls);
        reports.add(r);
    }
}
