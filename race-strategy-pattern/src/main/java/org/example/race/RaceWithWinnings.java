package org.example.race;

import org.example.strategy.rewards.IRaceRewards;
import org.example.strategy.validation.IRaceValidation;

import java.time.LocalDate;

public class RaceWithWinnings extends Race
{
    private IRaceRewards rewards;

    public RaceWithWinnings(String name, LocalDate dayOfRace,
                            IRaceValidation validation,
                            IRaceRewards rewards)
    {
        super(name, dayOfRace, validation);
        this.rewards = rewards;
    }

    @Override
    public void raceDay()
    {
        //run the race
        super.raceDay();

        //print out the winnings
        if (super.getRunners().size() > 0)
        {
            System.out.println("The winner is awarded " + rewards.getRaceRewards());
        }
    }
}
