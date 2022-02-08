public class Reading {
    private Time time;
    private double temp; //in Fahrenheit
    private double rainfall; //amt of rainfall since last reading

    public Reading(Time time, double temp, double rainfall){
        this.time = time;
        this.temp = temp;
        this.rainfall = rainfall;
    }

    /**
     * gets rainfall data in a reading
     * @return double rainfall field
     */
    public double getRainfall() {
        return rainfall;
    }

    /**
     * gets temp data in a reading
     * @return double temp field
     */
    public double getTemp() {
        return temp;
    }
}
