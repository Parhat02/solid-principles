package com.cydeo.solid.interfaceSegregation.good;

import com.cydeo.solid.interfaceSegregation.bad.Bird;

public class Chicken implements CanEat, CanWalk{

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
