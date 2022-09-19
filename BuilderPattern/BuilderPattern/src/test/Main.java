package test;

import builder.HouseSaleBuilder;
import model.HouseSale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> materials = new ArrayList<>();
        materials.add("100 2x4x8");
        materials.add("bucket of nails");

        //complex object creation
        //HouseSale dreamBuild = new HouseSale(LocalDate.now(), true, materials, false, 300000.0, 2100);

        HouseSale dreamBuild = new HouseSaleBuilder()
            .materialsDelivered(true)
            .sellPrice(300000.0)
            .squareFeet(2100)
            .permitsComplete(true)
            .buildDeadline(LocalDate.now())
            .materialsList(materials)
            .build();

        //use our object
        System.out.println(dreamBuild);

        //create a partial build
        HouseSaleBuilder builder = new HouseSaleBuilder()
            .sellPrice(400000.0)
            .squareFeet(2100);

        HouseSale anotherSale = builder.build();
        System.out.println(anotherSale);

        //update our builder for another build
        builder.sellPrice(450000.0);
        HouseSale lastSale = builder.build();
        System.out.println(lastSale);
    }
}