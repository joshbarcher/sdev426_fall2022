package edu.greenriver.sdev.clothingstore.service;

import edu.greenriver.sdev.clothingstore.database.ClothingRepository;
import edu.greenriver.sdev.clothingstore.model.Clothing;
import org.springframework.stereotype.Service;

import java.util.List;

//business (program) logic is located here, the controller
//uses this class to access the data layer
@Service
public class ClothingService
{
    //this is a spring bean!
    private ClothingRepository dataLayer;

    //inject the dependency through Spring
    public ClothingService(ClothingRepository dataLayer)
    {
        this.dataLayer = dataLayer;
    }

    public List<Clothing> getAll()
    {
        //perform a "select * from clothing"
        return dataLayer.findAll();
    }
}
