package com.ameer.polymorphism;

import com.ameer.polymorphism.ships.CargoShip;
import com.ameer.polymorphism.ships.CruiseShip;
import com.ameer.polymorphism.ships.Ship;

public class PolymorphismDriverProgram {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Generic Ship", "2025");
        ships[1] = new CargoShip("Cargo Shipper", "2020", 5000);
        ships[2] = new CruiseShip("The Cruiser", "2000", 5000);

        for (Ship ship : ships) {
            ship.printShipInfo();
            System.out.println();
        }
    }
}
