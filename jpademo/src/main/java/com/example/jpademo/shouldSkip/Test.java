package com.example.jpademo.shouldSkip;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person bean = ac.getBean(Person.class);

    }
}
