package edu.greenriver.sdev.test;

import edu.greenriver.sdev.model.Guitar;
import edu.greenriver.sdev.model.Instrument;

public class Main
{
    public static void main(String[] args)
    {
        Guitar myGuitar = new Guitar("Fender", 799.99, false, true);
        System.out.println(myGuitar);

        Instrument clarinet = Instrument.builder()
            .price(399.99)
            .category("wind")
            .type("clarinet")
            .material("wood")
            .build();

        System.out.println(clarinet);
    }
}