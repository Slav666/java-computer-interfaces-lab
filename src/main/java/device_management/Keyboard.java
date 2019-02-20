package device_management;

public class Keyboard {

    private String language;
    private int numberOfKeys;

    public Keyboard(String language, int numberOfKeys){
        this.language = language;
        this.numberOfKeys = numberOfKeys;
    }

    public String getLanguage() {
        return language;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String type(){
        return "I am typing";
    }
}
