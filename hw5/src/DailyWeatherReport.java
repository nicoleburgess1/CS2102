import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport{
    private GregorianCalendar date;
    private LinkedList<Double> tempReadings = new LinkedList<>();
    private LinkedList<Double> rainfallReadings = new LinkedList<>();

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> temps, LinkedList<Double> rainfalls){
        this.date = date;
        this.tempReadings = temps;
        this.rainfallReadings = rainfalls;
    }


    /**
     * gets date
     * @return gets date from GregorianCalendar object
     */
    public GregorianCalendar getDate(){
        return date;
    }

    /**
     * calculates average temp for the day
     * @return average of the doubles in the linked list tempReadings
     */
    public double getAvgTemp(){
        double sum=0;
        int count=tempReadings.size();
        for(double reading: tempReadings){
            sum+=reading;
        }

        if(count==0)
            return 0;
        return sum/count;
    }

    /**
     * calculates total rainfall for a day
     * @return gets total rainfall for
     */
    public double getTotalRainfall(){
        double sum=0;
        for(double rain: rainfallReadings){
            sum+=rain;
        }
        return sum;
    }
}
