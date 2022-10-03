package observer;

public class Hiker implements IObserver
{
    private String name;

    public Hiker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //this method will be called by Observable objects
    @Override
    public void update()
    {
        System.out.println("The hiker noticed something!");
    }
}
