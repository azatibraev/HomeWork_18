package com.company;

public class Sheep extends DomesticAnimal {

    public Sheep() {
    }

    public Sheep(float weight, byte age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public void eat() {
        System.out.println("The sheep is eating a corn");
    }
}