import java.util.GregorianCalendar;
import java.util.LinkedList;

public class LLWeather implements IWeather{
    private LinkedList<DailyWeatherReport> reports;

    public LLWeather(){
        reports = new LinkedList<DailyWeatherReport>();
    }

    /**
     * finds length of reports
     * @return int size of the linked list of reports
     */
    public int size(){
        return reports.size();
    }

    /**
     * calculates the average temperature of a month
     * @param month the month to take the avg temp of
     * @param year the year of the month to take the avg temp of
     * @return average of all the temps in reports for the given month and year
     */
    public double avgTempForMonth(int month, int year){
        double sum = 0;
        int count=0;
        for(DailyWeatherReport report: reports){
            int m = report.getDate().get(GregorianCalendar.MONTH);
            int y = report.getDate().get(GregorianCalendar.YEAR);
            if(m==month && y==year){
                sum += report.getAvgTemp();
                count++;
            }

        }
        if(count==0)
            return 0;
        return sum/count;
    }

    /**
     * stores a daily report in reports (linked list)
     * @param r DailyWeather report to add to the linked listreports
     */
    public void add(DailyWeatherReport r){
        reports.add(r);
    }

    /**
     * calculates the total rainfall during a month
     * @param month the month to find the total rainfall of
     * @param year the year of the month to find the total rainfall of
     * @return sum of all rainfall data for reports that are in the given month and year
     */
    public double totalRainForMonth(int month, int year){
        double sum = 0;
        for(DailyWeatherReport report: reports){
            int m = report.getDate().get(GregorianCalendar.MONTH);
            int y = report.getDate().get(GregorianCalendar.YEAR);
            if(m==month && y==year) {
                //System.out.print(report.getAvgRainfall());
                sum += report.getTotalRainfall();
            }
        }
        return sum;
    }
}
