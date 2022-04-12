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

        System.out.println(passengers);
        int survivedCount = PassengersDataService.getSurvivedCount(passengers);

        System.out.println("survived " + survivedCount + " out of " +passengers.size());

        double average = PassengersDataService.getAverageAge(passengers);

        System.out.println("average: " + average);

        Map<String, Integer> passengerCountBySurvival = PassengersDataService.getPassengerCountBySurvival(passengers);


        double[][] matrix = new double[passengers.size()][5];

        for (int i = 0; i < passengers.size(); i ++){
            Passenger passenger = passengers.get(i);
            double[] passengerVector = new double[5];
            passengerVector[0] = Double.parseDouble(passenger.getPassengerId());
            passengerVector[1] = passenger.getSurvived() ? 1 : 0;
            passengerVector[2] = Double.parseDouble(passenger.getPclass());
            passengerVector[3] = passenger.getGender().equals("male") ?  0: 1;
            passengerVector[4] = passenger.getAge();
            matrix[i] = passengerVector;
        }

        System.out.println(Arrays.deepToString(matrix));








    }

}
