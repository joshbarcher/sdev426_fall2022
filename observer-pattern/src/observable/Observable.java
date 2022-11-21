package observable;

import observer.IObserver;

import java.util.*;

//This class should be inherited by all "Observable" objects
//"Observable" objects do interesting things, which they will
//inform "Observers" when they happen
public abstract class Observable
{
    //store a list of observers
    private Set<IObserver> observers;

    public Observable()
    {
        observers = new HashSet<>();
    }

    public void addObserver(IObserver observer)
    {
        //this will "quietly" reject duplicate observers
        observers.add(observer);
    }

    public void removeObserver(IObserver observer)
    {
        observers.remove(observer);
    }

    //this method let's all observers know that something changed!
    public void notifyObservers()
    {
        for (IObserver observer : observers)
        {
            observer.update(this, null);
        }
    }

    public void notifyObservers(Object param)
    {
        for (IObserver observer : observers)
        {
            observer.update(this, param);
        }
    }
}










