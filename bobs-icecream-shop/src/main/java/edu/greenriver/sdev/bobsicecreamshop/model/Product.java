package edu.greenriver.sdev.bobsicecreamshop.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product
{
    @Id
    private String name;
    private double price;

    @Column(name="type")
    private String category;
    @Column(name="expires_on")
    private LocalDate expires;

    private String details;

    //an optional brand
    @OneToMany(mappedBy = "product")
    @ToString.Exclude
    private List<Brand> brand;
}
