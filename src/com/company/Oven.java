package com.company;

/**
 * Created by Daniel_D'AGE on 17.05.2018.
 */
public class Oven implements BrakingOven, RoastingOver {
    private int time;
    private int temp;


    @Override
    public void bakeCookies() {
        temp = 200;
        time = 150;
        turnOn();
    }


    @Override
    public void bakeBread() {
        temp = 220;
        time = 120;
        turnOn();
    }


    @Override
    public void roastChicken() {
        temp = 180;
        time = 90;
        turnOn();

    }

    private void turnOn() {
        System.out.println(String.format("Start. Temperatura wzrosła do %s, a piekarnik będzie pracował " +
                "przez %d minut. ", temp, time));
    }
}
