package memento;

public class Key
{
    private String door;
    private String color;
    private String owner;

    public Key(String door, String color, String owner)
    {
        this.door = door;
        this.color = color;
        this.owner = owner;
    }

    public String getDoor()
    {
        return door;
    }

    public String getColor()
    {
        return color;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setDoor(String door)
    {
        this.door = door;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    //this externalizes the data in the object returned
    public Memento createMemento()
    {
        //save and return the state
        return new Memento(door, color, owner);
    }

    //add the data back to the object
    public void setMemento(Memento memento)
    {
        //reset all field properties to match the memento
        door = memento.door;
        color = memento.color;
        owner = memento.owner;
    }

    @Override
    public String toString()
    {
        return "Key{" +
                "door='" + door + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public class Memento
    {
        private String door;
        private String color;
        private String owner;

        public Memento(String door, String color, String owner)
        {
            this.door = door;
            this.color = color;
            this.owner = owner;
        }
    }
}
