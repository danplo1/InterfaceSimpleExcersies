package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Oven oven = new Oven();
        BrakingOven brakingOven = oven;
        RoastingOver roastingOver = oven;

        brakingOven.bakeBread();
        brakingOven.bakeCookies();
        roastingOver.roastChicken();


    }
}
