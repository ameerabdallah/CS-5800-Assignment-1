package com.ameer.inheritance;

import com.ameer.inheritance.employee.*;

public class Inheritance {
    public static void main(String[] args) {
        Employee[] joe = new Employee[]{new SalariedEmployee(
                "Joe",
                "Jones",
                "111-11-1111",
                2_500.0
        ), new HourlyEmployee(
                "Stephanie",
                "Smith",
                "222-22-2222",
                25.0,
                32
        ), new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47), new CommissionEmployee(
                "Nicole",
                "Dior",
                "444-44-4444",
                50_000.0,
                0.15
        ), new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1_700.0), new BaseEmployee(
                "Mike",
                "Davenport",
                "666-66-6666",
                95_000.0
        ), new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 44_000.0, 0.22)};

        for (Employee employee : joe) {
            System.out.println("------------------------------");
            employee.printEmployeeInfo();
            System.out.println();
        }
    }
}
