package tut9.bridge.remotes;


import tut9.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    //TO-DO: Implement the mute() method
    public void mute() {
        //Display the current volume status is 'mute'
        System.out.println("Mute");
        //Set the volume to 0
        device.setVolume(0);
    }
}
