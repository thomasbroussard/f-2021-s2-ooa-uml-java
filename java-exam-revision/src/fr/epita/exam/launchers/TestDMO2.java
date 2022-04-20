package fr.epita.exam.launchers;

import fr.epita.exam.datamodel.Passenger;

public class TestDMO2 {

    public static void test(){
        Passenger passenger = new Passenger("Abbing, Mr Anthony","1st", 20, "male", true );
        System.out.println(passenger);
    }
}
