package com.company;

public class Main {

    public static void main(String[] args) {
        SolarSystem FactorX = new SolarSystem();
        FactorX.sun="1";
        FactorX.moon="4";
        FactorX.planet="2";
        FactorX.stars="10000";

//      adding features to our sun
        FeatureSun Xfact = new FeatureSun();
        Xfact.color = "green";
        Xfact.radius = "10000000000km";
        Xfact.heat = "30324498234823";
    }
}
