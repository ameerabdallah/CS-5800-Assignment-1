package com.ameer.polymorphism.ships;

public class CargoShip extends Ship {
    private int cargoCapacity; // in tons

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Ship Name: " + getName());
        System.out.printf("Cargo Capacity: %d tons\n", cargoCapacity);
    }
}
