package com.company;

public abstract class DomesticAnimal {
    private float weight;
    private byte age;
    private char gender;
    private String nickName;

    public DomesticAnimal() {
    }

    public DomesticAnimal(float weight, byte age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public abstract void  eat();

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "DomesticAnimal: " + '\n' +
                "weight: " + weight  + '\n' +
                "age: " + age + '\n' +
                "gender: " + gender + '\n' +
                "nickName: " + nickName + '\n';
    }
}