package test;

import observable.WildernessAnimal;
import observer.Hiker;

public class Main
{
    public static void main(String[] args)
    {
        //create observables
        WildernessAnimal bisonAnimal = new WildernessAnimal("Bison", "Yellowstone Park");

        //create observers
        Hiker joshHiker = new Hiker("Josh");
        Hiker ibbyHiker = new Hiker("Ibby");

        //connect observables & observers
        bisonAnimal.addObserver(joshHiker);
        bisonAnimal.addObserver(ibbyHiker);

        //then, we just use our classes like normal...
        bisonAnimal.performAction("Sat down on the road");
    }
}
