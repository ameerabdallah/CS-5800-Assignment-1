package com.ameer.polymorphism.ships;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Ship Name: " + getName());
        System.out.printf("Max Passengers: %d\n", maxPassengers);
    }
}
