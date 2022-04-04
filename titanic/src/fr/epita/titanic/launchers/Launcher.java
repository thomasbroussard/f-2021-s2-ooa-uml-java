package fr.epita.titanic.launchers;

import fr.epita.titanic.datamodel.Passenger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Launcher {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./titanic/titanic.csv");
        if (file.exists()){
            System.out.println("the file has been found!");
        }
        Scanner scanner = new Scanner(file);
        List<Passenger> passengers = new ArrayList<>();
        double averageAge = 0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] split = line.split(",");

            String passengerId = split[0];
            boolean survived = Boolean.valueOf(split[1]);
            String pclass = split[2];
            String gender = split[3];
            double age = Double.valueOf(split[4]);

            Passenger passenger = new Passenger(passengerId,survived, pclass,gender, age);
            passengers.add(passenger);
            averageAge += passenger.getAge();

        }
        averageAge = averageAge / passengers.size();

        double average = passengers
                .stream()
                .mapToDouble(Passenger::getAge)
                .average()
                .getAsDouble();

        System.out.println("average: " + average);

    }
}
