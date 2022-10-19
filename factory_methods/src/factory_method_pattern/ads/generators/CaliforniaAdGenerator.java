package factory_method_pattern.ads.generators;

import factory_method_pattern.ads.entities.Advertisement;

import java.util.List;

public class CaliforniaAdGenerator implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        return List.of(
            new Advertisement("Visit Disneyland!"),
            new Advertisement("Go to Yosemite"),
            new Advertisement("Visit the beaches!")
        );
    }
}
