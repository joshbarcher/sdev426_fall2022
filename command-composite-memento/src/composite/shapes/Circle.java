package composite.shapes;

public class Circle implements IDrawable
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.printf("Drew a circle - radius: %f%n", radius);
    }
}
