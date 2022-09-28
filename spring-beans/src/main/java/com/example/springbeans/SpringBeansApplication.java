package com.example.springbeans;

import com.example.springbeans.model.FileLogger;
import com.example.springbeans.model.ILogger;
import com.example.springbeans.model.IRandom;
import com.example.springbeans.model.MyRandom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Random;

@SpringBootApplication
public class SpringBeansApplication
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(
            SpringBeansApplication.class, args);

        //ask for the bean that Spring created for us
        IRandom random = context.getBean(IRandom.class);
        System.out.println(random);
        System.out.println(random.between(1, 100));

        //will this give us the same or a different object?
        /*MyRandom anotherRandom = context.getBean(MyRandom.class);
        System.out.println(anotherRandom);
        System.out.println(anotherRandom.between(1, 100));*/

        ILogger log = context.getBean(ILogger.class);
        log.error("File not found!");
        log.info("Hello, world!");

        /*FileLogger logger = new FileLogger("log.txt");*/

        for (String beanName : context.getBeanDefinitionNames())
        {
            System.out.println(beanName);
        }
    }
}
