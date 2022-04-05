package fr.epita.titanic.launchers;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.service.PassengersDataService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Launcher {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./titanic/titanic.csv");
        List<Passenger> passengers = PassengersDataService.readPassengersFromFile(file);

        int survivedCount = PassengersDataService.getSurvivedCount(passengers);

        System.out.println("survived " + survivedCount + " out of " +passengers.size());

        double average = PassengersDataService.getAverageAge(passengers);

        System.out.println("average: " + average);

        Map<String, Integer> passengerCountBySurvival = PassengersDataService.getPassengerCountBySurvival(passengers);

    }

}
