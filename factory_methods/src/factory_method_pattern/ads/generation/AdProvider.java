package factory_method_pattern.ads.generation;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generators.IRegionalGenerator;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AdProvider
{
    private Random random = new Random();
    private List<Advertisement> ads;
    
    public AdProvider()
    {

    }
    
    public abstract IRegionalGenerator getGenerator();
    
    public Advertisement showAd()
    {
        ensureGeneratorExists();

        //pick a random advertisement to show
        return ads.get(random.nextInt(ads.size()));
    }
    
    public List<Advertisement> getAllAds()
    {
        ensureGeneratorExists();

        return Collections.unmodifiableList(ads);
    }

    private void ensureGeneratorExists()
    {
        //get our regional ads if not loaded
        if (ads == null)
        {
            IRegionalGenerator generator = getGenerator();
            ads = generator.getAppropriateAds();
        }
    }
}

