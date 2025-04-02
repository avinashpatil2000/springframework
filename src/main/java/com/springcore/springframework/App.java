package com.springcore.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springframework/config.xml");
        	
        Student student1 =  (Student) context.getBean("std1");
        System.out.println(student1);
        
        Student student2 = (Student) context.getBean("std2");
        System.out.println(student2);
        
        
        
    }
}
