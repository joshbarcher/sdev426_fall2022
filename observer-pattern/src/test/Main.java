package test;

import observable.WildernessAnimal;
import observer.Hiker;
import observer.Hunter;

public class Main
{
    public static void main(String[] args)
    {
        //create observables
        WildernessAnimal bisonAnimal = new WildernessAnimal("Bison", "Yellowstone Park");
        WildernessAnimal woodPeckerAnimal = new WildernessAnimal("Wood Pecker", "Yellowstone Park");

        //create observers
        Hiker joshHiker = new Hiker("Josh");
        Hiker ibbyHiker = new Hiker("Ibby");
        Hunter bobHunter = new Hunter("Bob");

        //connect observables & observers
        bisonAnimal.addObserver(joshHiker);
        bisonAnimal.addObserver(ibbyHiker);
        bisonAnimal.addObserver(bobHunter);
        woodPeckerAnimal.addObserver(bobHunter);

        //then, we just use our classes like normal...
        bisonAnimal.performAction("Sat down on the road");
        woodPeckerAnimal.performAction("Flew up the mountain");
    }
}
