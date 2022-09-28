package com.example.springbeans.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

@Component
@Primary //this will break ties if there is a request an ILogger bean
public class FileLogger implements ILogger
{
    //private static final String PATH = "log.txt";

    private PrintWriter writer;
    private MyRandom random;

    public FileLogger(@Qualifier("path") String path) throws IOException
    {
        writer = new PrintWriter(new FileOutputStream(path));
    }

    //this should use setter-based dependency injection
    @Autowired
    public void setRandom(MyRandom random)
    {
        this.random = random;
    }

    @Override
    public void warning(String message)
    {
        writer.println("WARNING - " + message);
        writer.flush();
    }

    @Override
    public void error(String message)
    {
        writer.println("ERROR - " + message);
        writer.flush();
    }

    @Override
    public void info(String message)
    {
        writer.println("INFO - " + message);
        writer.flush();
    }
}
