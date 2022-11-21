package composite.test;

import composite.shapes.Circle;
import composite.shapes.CompositeShape;
import composite.shapes.IDrawable;
import composite.shapes.Rectangle;

public class TestShapes
{
    public static void main(String[] args)
    {
        IDrawable[] drawables = {
            new Rectangle(10, 2),
            new Circle(10),
            new CompositeShape(new IDrawable[] { //snowman?!
                new Circle(30),
                new Circle(30),
                new CompositeShape(new IDrawable[] {
                    new Rectangle(20, 80),
                    new Circle(5),
                    new Circle(5)
                })
            })
        };

        IDrawable entireScene = new CompositeShape(drawables);
        entireScene.draw();
    }
}
