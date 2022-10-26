package edu.greenriver.sdev.bobsicecreamshop;

import edu.greenriver.sdev.bobsicecreamshop.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BobsIcecreamShopApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(BobsIcecreamShopApplication.class, args);

        //persist this product object to the database
        Product product = new Product();
    }

}
