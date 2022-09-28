package com.example.springbeans.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ConsoleLogger implements ILogger
{
    private String appTitle;

    public ConsoleLogger(@Qualifier("title") String appTitle)
    {
        this.appTitle = appTitle;
    }

    @Override
    public void warning(String message)
    {
        System.out.println(appTitle + " WARNING - " + message);
    }

    @Override
    public void error(String message)
    {
        System.out.println(appTitle + " ERROR - " + message);
    }

    @Override
    public void info(String message)
    {
        System.out.println(appTitle + " INFO - " + message);
    }
}
