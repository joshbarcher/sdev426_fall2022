package edu.greenriver.sdev.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Instrument
{
    private String type;
    private String category;
    private double price;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private String material;

}
