package bridge;

public class DVDPlayer implements Device {
    @Override
    public void turnOn() {
        System.out.println("DVD Player is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("DVD Player is OFF");
    }

    @Override
    public void setChannel(int channel) {
        // DVD player does not have channels
        System.out.println("DVD Player does not have channels");
    }

    public void play() {
        System.out.println("DVD Player is playing");
    }

    public void pause() {
        System.out.println("DVDPlayer Player is Paused");
    }
}
