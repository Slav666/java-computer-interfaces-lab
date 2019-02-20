package device_management;

import behaviours.IOutput;
import behaviours.IInput;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput outputDevice;
    private IInput inputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice){
        this.outputDevice = outputDevice;
    }

    public IInput getInputDevice(){
        return this.inputDevice;
    }

    public void setInputDevice(IInput inputDevice){
        this.inputDevice = inputDevice;
    }

    public String receiveData(IInput inputDevice){
        String receivedData = inputDevice.sendData();
        return "I am receiving data: " + receivedData;
    }


}
