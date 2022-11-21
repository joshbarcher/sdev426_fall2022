package observer;

import observable.Observable;
import observable.WildernessAnimal;

import java.util.ArrayList;
import java.util.List;

public class Hunter implements IObserver
{
    private String name;
    private List<String> huntingGear;

    public Hunter(String name)
    {
        this.name = name;
        huntingGear = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public List<String> getHuntingGear()
    {
        return huntingGear;
    }

    @Override
    public void update(Observable observable, Object params)
    {
        WildernessAnimal animal = (WildernessAnimal) observable;

        System.out.println("The hunter noticed something");
        System.out.println(params.toString());

        if (animal.getLocation().equals("Yellowstone Park"))
        {
            System.out.println("The hunter knows to not hunt in Yellowstone");
        }
        System.out.println();
    }
}
