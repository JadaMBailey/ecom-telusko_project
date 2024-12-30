package com.marlieb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        // Container is created with this line, #Todo: need to research this concrete class below
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev obj = context.getBean(Dev.class);
//        Laptop obj1 = (Laptop) context.getBean("laptop");

        obj.build();
//        System.out.println(obj.getLaptop());

    }
}
