public class CircuitBreaker extends ElectricalDevice{
    private int maxLoad;
    private int outlets;
    // the amount of power this can provide to stuff plugged into it
    private int providingPower;


    public CircuitBreaker(int providingPower, ElectricalDevice powerSource, int requiredLoad) {
        super(providingPower, powerSource, requiredLoad);
    }
}
