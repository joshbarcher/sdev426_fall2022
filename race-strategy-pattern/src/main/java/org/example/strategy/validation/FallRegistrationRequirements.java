package org.example.strategy.validation;

import org.example.entities.Document;
import org.example.entities.Runner;

import java.util.Set;

public class FallRegistrationRequirements implements IRaceValidation
{
    @Override
    public Set<Runner> filterRunners(Set<Runner> runners)
    {
        //required doc(s)
        Document document = new Document("Fall Registration");

        //TODO filter later...
        return null;
    }
}
