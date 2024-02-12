package bridge;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        device.turnOn();
    }

    @Override
    public void powerOff() {
        device.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void play() {
        if (device instanceof DVDPlayer) {
            ((DVDPlayer) device).play();
        } else {
            System.out.println("This functionality is only available for DVDPlayer");
        }
    }

    public void pause() {
        if (device instanceof DVDPlayer) {
            ((DVDPlayer) device).pause();
        } else {
            System.out.println("This functionality is only available for DVDPlayer");
        }
    }
}
