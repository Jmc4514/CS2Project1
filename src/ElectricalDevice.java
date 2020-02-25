public abstract class ElectricalDevice {
    //this is the parent class of both circuits and appliances
    private boolean powerState;
    private ElectricalDevice powerSource;
    // the power it gives to things under it
    private int providingPower;
    private int requiredLoad;

    public ElectricalDevice (int providingPower, ElectricalDevice powerSource, int requiredLoad){
        powerState = false;
        this.providingPower = providingPower;
        this.powerSource = powerSource;
        this.requiredLoad = requiredLoad;
    }


    public void draw(){
        //take away the required load from the parent
        powerSource.providingPower -= requiredLoad;
        //turn on the current device
        powerState = true;
    }


}
