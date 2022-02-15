package com.company;

import java.util.Arrays;

public class Farm {

    private String address;
    private  Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;
    private String ownerName;

    public Farm() {
    }

    public Farm(String address, Cow[] cows, Sheep[] sheep, Horse[] horses, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm: " +'\n' +
                "address: " + address + '\n' +
                "cows: " +cows.length + '\n' +
                "sheep: " + sheep.length + '\n' +
                "horses: " + horses.length + '\n' +
                "ownerName: " + ownerName + '\n';
    }
}