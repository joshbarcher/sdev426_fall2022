package observer;

import observable.Observable;

//If a class wants to observe an "Observable" then
//it should use this interface
public interface IObserver
{
    void update(Observable observable, Object params);
}
