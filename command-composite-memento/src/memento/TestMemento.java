package memento;

public class TestMemento
{
    public static void main(String[] args)
    {
        //create an object
        Key myFrontDoorKey = new Key("front door", "gold", "josh");

        //save a memento
        Key.Memento memento = myFrontDoorKey.createMemento();

        //make changes...
        myFrontDoorKey.setColor("red");
        myFrontDoorKey.setOwner("joe");

        Key.Memento anotherMemento = myFrontDoorKey.createMemento();
        System.out.println(myFrontDoorKey);

        //revert using the memento at a later point...
        myFrontDoorKey.setMemento(memento);
        System.out.println(myFrontDoorKey);

        myFrontDoorKey.setMemento(anotherMemento);
        System.out.println(myFrontDoorKey);
    }
}
