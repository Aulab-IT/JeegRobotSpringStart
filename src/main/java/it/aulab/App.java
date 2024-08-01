package it.aulab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.aulab.services.JeegService;

public class App 
{
public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        JeegService service = context.getBean("jeegService", JeegService.class);

        service.attack();
        service.move();
    }
}
