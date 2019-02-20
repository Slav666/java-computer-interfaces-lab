package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    private String type;
    private boolean laser;

    public Mouse(String type, boolean laser){
        this.type = type;
        this.laser = laser;
    }

    public String getType() {
        return this.type;
    }

    public boolean getLaser() {
        return this.laser;
    }

    public String click(){
        return "I am clicking";
    }

    @Override
    public String sendData() {
        return "beep beep";
    }
}
