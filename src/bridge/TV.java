package bridge;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Setting TV channel to " + channel);
    }
}
