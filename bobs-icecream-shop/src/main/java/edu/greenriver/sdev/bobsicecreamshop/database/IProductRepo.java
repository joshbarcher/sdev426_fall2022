package edu.greenriver.sdev.bobsicecreamshop.database;

import edu.greenriver.sdev.bobsicecreamshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product, String>
{
    //select * from products where price > compare
    List<Product> findProductsByPriceGreaterThan(double compare);
    Product findByProductName(String productName);
    Product findFirstByPrice(double price);
}
