package org.example.race;

import lombok.Data;
import org.example.entities.Runner;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Data
public class Race
{
    private String name;
    private LocalDate dayOfRace;
    private Set<Runner> runners = new HashSet<>();

    public Race(String name, LocalDate dayOfRace)
    {
        this.name = name;
        this.dayOfRace = dayOfRace;
    }

    //add a runner to the race, we'll validate them later
    public void register(Runner runner)
    {
        //set will remove duplicate runners
        runners.add(runner);
    }

    public void raceDay()
    {
        //welcome people to the race
        System.out.println("Welcome to - " + name);
        System.out.println("Registered today:");
        runners.stream().forEach(System.out::println);
        System.out.println();

        //make sure everyone can run
        //TODO add validation as a strategy!

        //simulate the race
        Runner winner = waitForWinner();
        System.out.println(winner.getName() + " won the race!");
    }

    public Runner waitForWinner()
    {
        //skip through the runners to a random runner
        Random random = new Random();
        Runner runner = runners.stream()
            .skip(random.nextInt(runners.size()))
            .findFirst()
            .get();
        return runner;
    }
}

