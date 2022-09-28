package org.example.strategy.validation;

import org.example.entities.Document;
import org.example.entities.Runner;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WinterRegistrationRequirements implements IRaceValidation
{
    @Override
    public Set<Runner> filterRunners(Set<Runner> runners)
    {
        //required doc(s)
        List<Document> documents = List.of(
            new Document("Winter Registration"),
            new Document("Liability Waiver")
        );

        return runners.stream()
                .filter(runner -> runner.getDocuments().containsAll(documents))
                .collect(Collectors.toSet());
    }
}
