public interface IWeather {
    /**
     * finds length of reports
     * @return int size of reports
     */
    public int size();

    /**
     * calculates the average temperature of a month
     * @param month the month to take the avg temp of
     * @param year the year of the month to take the avg temp of
     * @return average of all the temps in reports for the given month and year
     */
    public double avgTempForMonth(int month, int year);

    /**
     * calculates the total rainfall during a month
     * @param month the month to find the total rainfall of
     * @param year the year of the month to find the total rainfall of
     * @return sum of all rainfall data for reports that are in the given month and year
     */
    public double totalRainForMonth(int month, int year);

    /**
     * stores a daily report in reports
     * @param r DailyWeather report to add to the reports
     */
    public void add(DailyWeatherReport r);
}
