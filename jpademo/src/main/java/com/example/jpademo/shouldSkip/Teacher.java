package com.example.jpademo.shouldSkip;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;

@Data
public class Teacher implements BeanNameAware {

    private String name;
    @Override
    public void setBeanName(String name) {
        this.name=name;
    }
}
