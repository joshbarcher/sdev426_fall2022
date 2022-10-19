package factory_method_pattern.ads.program;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.AdProvider;
import factory_method_pattern.ads.generation.CaliforniaAdProvider;

public class AdsTest
{
    public static void main(String[] args)
    {
        AdProvider adgenerator = new CaliforniaAdProvider();

        for (Advertisement ad : adgenerator.getAllAds())
        {
            System.out.println(ad);
        }

        //create an ad provider for washington state (provides 3 ads)
        //then print an ad randomly to the console

    }
}



