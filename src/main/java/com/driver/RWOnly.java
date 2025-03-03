package com.driver;

public class RWOnly {
    private String name;
    public void SetName(String name){
        this.name=name;
    }
    public void getName(){
        return name;
    }
}
