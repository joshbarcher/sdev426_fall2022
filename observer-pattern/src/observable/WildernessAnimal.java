package observable;

public class WildernessAnimal extends Observable
{
    private String type;
    private String location;

    public WildernessAnimal(String type, String location) {
        this.type = type;
        this.location = location;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    //this simulates something interesting happening, and
    //this class should let observers know about it
    public void performAction(String actionMessage)
    {
        System.out.println("The animal (" + type + ") did something!");

        //this is from the parent class
        notifyObservers();
    }
}
