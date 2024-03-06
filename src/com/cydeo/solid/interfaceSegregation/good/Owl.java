package com.cydeo.solid.interfaceSegregation.good;

import com.cydeo.solid.interfaceSegregation.bad.Bird;

public class Owl implements CanEat, CanWalk, CanFly {

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void fly() {
        System.out.println("Flying.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

}
