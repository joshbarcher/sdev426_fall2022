package edu.greenriver.sdev.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor //default constructor
@ToString
public class Guitar
{
    private String brand;
    private double price;
    private boolean electric;
    private boolean inTune;
}
