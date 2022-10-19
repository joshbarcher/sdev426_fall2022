package factory_method_pattern.ads.generation;

import factory_method_pattern.ads.generators.CaliforniaAdGenerator;
import factory_method_pattern.ads.generators.IRegionalGenerator;

public class CaliforniaAdProvider extends AdProvider
{
    //this is a factory method! it is responsible for returning
    //an ad generator for a specific region!
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new CaliforniaAdGenerator();
    }
}
