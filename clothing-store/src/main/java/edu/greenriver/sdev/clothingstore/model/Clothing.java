package edu.greenriver.sdev.clothingstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//a JPA entity has a backing table for objects of this type in a db
@Entity

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clothing
{
    //use a surrogate key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clothingId;

    private String name;
    private String description;
    private boolean onSale;
    private double price;
}
