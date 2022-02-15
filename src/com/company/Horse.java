package com.company;

public class Horse extends DomesticAnimal {

    private String color;

    public Horse() {

    }

    public Horse(String color) {
        this.color = color;
    }

    public Horse(float weight, byte age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        @Override
        public void eat() {
            System.out.println("The horse is eating a green grace");
        }
    }