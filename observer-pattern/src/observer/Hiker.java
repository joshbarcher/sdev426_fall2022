package observer;

import observable.Observable;
import observable.WildernessAnimal;

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
    public void update(Observable observable, Object params)
    {
        WildernessAnimal animal = (WildernessAnimal) observable;
        System.out.println("The hiker noticed something changed with a " +
                           animal.getType());
        System.out.println(params);
        System.out.println();
    }
}
