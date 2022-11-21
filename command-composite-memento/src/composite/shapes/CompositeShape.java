package composite.shapes;

public class CompositeShape implements IDrawable
{
    private IDrawable[] drawables;

    public CompositeShape(IDrawable[] drawables)
    {
        this.drawables = drawables;
    }

    @Override
    public void draw()
    {
        for (IDrawable drawable : drawables)
        {
            drawable.draw();
        }
    }
}
