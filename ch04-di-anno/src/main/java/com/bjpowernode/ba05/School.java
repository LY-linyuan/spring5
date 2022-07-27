package com.bjpowernode.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author 临渊
 * @Date 2022-07-26 18:03
 */

@Component("mySchool")
public class School {
    @Value("山东大学")
    private String name;
    @Value("山东济南")
    private String address;

    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
