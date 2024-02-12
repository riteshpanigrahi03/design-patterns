package bridge;

public abstract class RemoteControl {
    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void setChannel(int channel);
}
