package model;

import java.time.LocalDate;
import java.util.List;

public class HouseSale
{
    private LocalDate buildDeadline;
    private boolean materialsDelivered;
    private List<String> materialsList;
    private boolean permitsComplete;
    private double sellPrice;
    private int squareFeet;

    public HouseSale(LocalDate buildDeadline, boolean materialsDelivered, List<String> materialsList,
                     boolean permitsComplete, double sellPrice, int squareFeet)
    {
        this.buildDeadline = buildDeadline;
        this.materialsDelivered = materialsDelivered;
        this.materialsList = materialsList;
        this.permitsComplete = permitsComplete;
        this.sellPrice = sellPrice;
        this.squareFeet = squareFeet;
    }

    public LocalDate getBuildDeadline() {
        return buildDeadline;
    }
    public boolean isMaterialsDelivered() {
        return materialsDelivered;
    }
    public List<String> getMaterialsList() {
        return materialsList;
    }
    public boolean isPermitsComplete() {
        return permitsComplete;
    }
    public double getSellPrice() {
        return sellPrice;
    }

    public int getSquareFeet()
    {
        return squareFeet;
    }

    @Override
    public String toString()
    {
        return "HouseBuild{" +
                "buildDeadline=" + buildDeadline +
                ", materialsDelivered=" + materialsDelivered +
                ", materialsList=" + materialsList +
                ", permitsComplete=" + permitsComplete +
                ", sellPrice=" + sellPrice +
                ", squareFeet=" + squareFeet +
                '}';
    }
}
