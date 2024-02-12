package bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        // Step 1: Create a DVDPlayer and an instance of AdvancedRemoteControl
        DVDPlayer dvdPlayer = new DVDPlayer();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(dvdPlayer);

        // Step 2: Power on the DVDPlayer using the AdvancedRemoteControl
        advancedRemoteControl.powerOn();

        // Step 3: Play the DVDPlayer using the AdvancedRemoteControl
        advancedRemoteControl.play();

        // Step 4: Power off the DVDPlayer using the AdvancedRemoteControl
        advancedRemoteControl.powerOff();

        // Step 5: Create a TV and reuse the AdvancedRemoteControl for the TV
        TV tv = new TV();
        advancedRemoteControl = new AdvancedRemoteControl(tv);

        // Step 6: Power on the TV using the AdvancedRemoteControl
        advancedRemoteControl.powerOn();

        // Step 7: Play the TV using the AdvancedRemoteControl
        advancedRemoteControl.play();
    }
}
