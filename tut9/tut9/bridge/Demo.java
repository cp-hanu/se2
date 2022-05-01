package tut9.bridge;

import design_pattern.creational_patterns.abstractfactory.Bank;
import tut9.bridge.devices.Device;
import tut9.bridge.devices.Radio;
import tut9.bridge.devices.Tv;
import tut9.bridge.remotes.AdvancedRemote;
import tut9.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    //TO-DO: Implement the method testDevice()
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        //Create the new BasicRemote instance
        BasicRemote basicRemote = new BasicRemote(device);

        //Power on the device
        basicRemote.power();
        //Display the status of device
        System.out.println("Power on");
        System.out.println("Tests with advanced remote.");
        //Create the new AdvancedRemote instance
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        //Power on the device
        advancedRemote.power();
        //Mute the device
        advancedRemote.mute();
        //Display the status of device
        System.out.println("Muted");
    }
}
