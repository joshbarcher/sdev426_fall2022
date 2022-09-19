package builder;

import model.HouseSale;

import java.time.LocalDate;
import java.util.List;

//the job of this class is to help create HouseSale objects
public class HouseSaleBuilder
{
    private LocalDate buildDeadline;
    private boolean materialsDelivered;
    private List<String> materialsList;
    private boolean permitsComplete;
    private double sellPrice;
    private int squareFeet;

    public HouseSaleBuilder()
    {
        //do nothing...
    }

    public HouseSaleBuilder buildDeadline(LocalDate buildDeadline)
    {
        this.buildDeadline = buildDeadline;

        //return the object you called this method on (for method chaining)
        return this;
    }

    public HouseSaleBuilder materialsDelivered(boolean materialsDelivered)
    {
        this.materialsDelivered = materialsDelivered;
        return this;
    }

    public HouseSaleBuilder materialsList(List<String> materialsList)
    {
        this.materialsList = materialsList;
        return this;
    }

    public HouseSaleBuilder permitsComplete(boolean permitsComplete)
    {
        this.permitsComplete = permitsComplete;
        return this;
    }

    public HouseSaleBuilder sellPrice(double sellPrice)
    {
        this.sellPrice = sellPrice;
        return this;
    }

    public HouseSaleBuilder squareFeet(int squareFeet)
    {
        this.squareFeet = squareFeet;
        return this;
    }

    //this is an important method for the builder, you can have multiple "build" methods
    public HouseSale build()
    {
        //take the data in the builder and pass it to a new product object
        return new HouseSale(buildDeadline, materialsDelivered, materialsList,
                             permitsComplete, sellPrice, squareFeet);
    }
}
