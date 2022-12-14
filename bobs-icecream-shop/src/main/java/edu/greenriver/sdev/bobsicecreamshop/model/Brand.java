package edu.greenriver.sdev.bobsicecreamshop.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="product_brand")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Brand
{
    @Id
    private String name;
    private String parentCompany;

    @ManyToOne
    @JoinColumn(name = "productName")
    @ToString.Exclude //prevent infinite recursion with this and the product class
    private Product product;
}
