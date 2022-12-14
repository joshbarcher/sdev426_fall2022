package edu.greenriver.sdev.bobsicecreamshop;

import edu.greenriver.sdev.bobsicecreamshop.database.IBrandRepo;
import edu.greenriver.sdev.bobsicecreamshop.database.IProductRepo;
import edu.greenriver.sdev.bobsicecreamshop.model.Brand;
import edu.greenriver.sdev.bobsicecreamshop.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class BobsIcecreamShopApplication
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(BobsIcecreamShopApplication.class, args);
        IProductRepo productRepo = context.getBean(IProductRepo.class);
        IBrandRepo brandRepo = context.getBean(IBrandRepo.class);

        //persist this product object to the database
        List<Product> products = List.of(
            Product.builder()
                .name("banana split")
                .price(3.99)
                .details("A banana & icecream treat")
                .category("food")
                .expires(LocalDate.now())
                .build(),
            Product.builder()
                .name("fudge surprise")
                .price(3.99)
                .details("Fudge and vanilla icecream")
                .category("food")
                .expires(LocalDate.now())
                .build(),
            Product.builder()
                .name("umbrella")
                .price(32.99)
                .details("An umbrella to keep you dry")
                .category("accessory")
                .expires(LocalDate.now())
                .build()
        );

        productRepo.saveAll(products);

        //create a brand and save to db
        Brand umbrellaBrand = Brand.builder()
            .name("never-wet")
            .parentCompany("umbrella acme inc")
            .build();
        Brand alternativeBrand = Brand.builder()
                .name("acme-default")
                .parentCompany("umbrella acme inc")
                .build();
        brandRepo.save(umbrellaBrand);
        brandRepo.save(alternativeBrand);

        //connect the objects across the relationship
        Product umbrellaProduct = products.get(2);
        umbrellaProduct.setBrand(List.of(
            umbrellaBrand,
            alternativeBrand
        ));
        umbrellaBrand.setProduct(umbrellaProduct);
        alternativeBrand.setProduct(umbrellaProduct);

        //save the relationship
        productRepo.save(umbrellaProduct);
        brandRepo.save(umbrellaBrand);
        brandRepo.save(alternativeBrand);

        Product umbrella = productRepo.findByName("umbrella");
        System.out.println(umbrella);

        Product cheapProduct = productRepo.findFirstByPrice(3.99);
        System.out.println(cheapProduct);
    }
}
