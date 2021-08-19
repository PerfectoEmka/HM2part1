package com.example.recyclerview;

public class People {

    private String name;
    private Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

}
