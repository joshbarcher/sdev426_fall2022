package factory_methods_practice;

public class TestColors
{
    public static void main(String[] args)
    {
        //Color color = new Color(1, 2, 3);
        Color magenta = Color.ofRed(0, 200);
        Color randomColor = Color.ofRandom();
        Color myColor = Color.of(2, 212, 32);

        System.out.println(magenta);
        System.out.println(randomColor);
        System.out.println(myColor);
    }
}
