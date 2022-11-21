package composite.shapes;

public class Rectangle implements IDrawable
{
    private double width;
    private double length;

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw()
    {
        System.out.printf("Drew a rectangle - width: %f, length: %f%n",
                width, length);
    }
}
