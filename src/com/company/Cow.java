package com.company;

public class Cow extends DomesticAnimal {

    public Cow() {
    }

    public Cow(float weight, byte age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public void eat() {
        System.out.println("The cow is eating a hay");
    }
}