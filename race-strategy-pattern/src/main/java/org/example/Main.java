package org.example;

import org.example.entities.Document;
import org.example.entities.Runner;
import org.example.race.Race;
import org.example.strategy.validation.FallRegistrationRequirements;
import org.example.strategy.validation.WinterRegistrationRequirements;

import java.time.LocalDate;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //a group of runners to test with
        Runner[] runners = {
            new Runner("Stan Williams", Arrays.asList(new Document("Winter Registration"))),
            new Runner("Michelle Smith", Arrays.asList(new Document("Fall Registration"),
                                                       new Document("Liability Waiver"))),
            new Runner("Tyler Patrick", Arrays.asList(new Document("Winter Registration"),
                                                      new Document("Liability Waiver"))),
            new Runner("Jean Davis", Arrays.asList(new Document("Winter Registration"),
                                                   new Document("Liability Waiver"))),
            new Runner("Susie Brown", Arrays.asList(new Document("Fall Registration"))),
            new Runner("Terry Wilson", Arrays.asList(new Document("Fall Registration"),
                                                     new Document("Liability Waiver")))
        };

        //create a race
        Race fallCostumeRace = new Race("Fall Costume Bonanza", LocalDate.of(2022, 10, 31),
                                        new FallRegistrationRequirements());

        //turn the runners into a stream and register each of them
        Arrays.stream(runners).forEach(fallCostumeRace::register);

        fallCostumeRace.raceDay();
        System.out.println();

        //creating a second race with a different registration (strategy) - winter registration,
        //liability waiver - DON'T CHANGE THE RACE CLASS!

        Race winterRace = new Race("Winter Race", LocalDate.of(2022, 12, 25),
                                   new WinterRegistrationRequirements());
        Arrays.stream(runners).forEach(winterRace::register);
        winterRace.raceDay();
    }
}














