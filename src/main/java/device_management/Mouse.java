package device_management;

public class Mouse {

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
}
