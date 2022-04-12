package fr.epita.titanic.service;

import fr.epita.titanic.datamodel.Passenger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.spec.ECField;
import java.util.*;

public class PassengersDataService {


    private static String filePath;

    public static final String SURVIVED_KEY = "survived";
    public static final String NOT_SURVIVED_KEY = "not-survived";


    public static Map<String, Integer> getPassengerCountBySurvival(List<Passenger> passengers) {
        Map<String, Integer> passengerCountBySurvival = new HashMap<>();
        for (Passenger passenger : passengers) {
            if (passenger.getSurvived()) {
                Integer count = passengerCountBySurvival.get(SURVIVED_KEY);
                if (count == null) {
                    count = 0;
                }
                passengerCountBySurvival.put(SURVIVED_KEY, count + 1);
            } else {
                Integer count = passengerCountBySurvival.get(NOT_SURVIVED_KEY);
                if (count == null) {
                    count = 0;
                }
                passengerCountBySurvival.put(NOT_SURVIVED_KEY, count + 1);
            }
        }
        return passengerCountBySurvival;
    }

    public static int getSurvivedCount(List<Passenger> passengers) {
        int survivedCount = 0;
        for (Passenger p : passengers) {
            if (p.getSurvived()) {
                survivedCount++;
            }
        }
        return survivedCount;
    }

    public static double getAverageAge(List<Passenger> passengers) {
        OptionalDouble average = passengers
                .stream()
                .mapToDouble(Passenger::getAge)
                .average();
        if (average.isPresent()) {
            return average.getAsDouble();
        }
        return 0;

    }

    public static List<Passenger> readPassengersFromFile(File file) {
        if (file.exists()) {
            System.out.println("the file has been found!");
        }
        try (Scanner scanner = new Scanner(file)) {
            List<Passenger> passengers = new ArrayList<>();


            //we want to skip the header row
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] split = line.split(",");

                String passengerId = split[0];
                boolean survived = split[1].equals("1");
                String pclass = split[2];
                String gender = split[3];

                String rawAge = split[4];
                double age = 0;
                boolean invalidAge = rawAge == null || rawAge.isEmpty();
                if (!invalidAge) {
                    age = Double.parseDouble(rawAge);
                }
                Passenger passenger = new Passenger(passengerId, survived, pclass, gender, age);
                if (invalidAge) {
                    //do nothing or print a warning
                } else {
                    passengers.add(passenger);
                }
            }
            return passengers;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }





    public static void writeAsCsv(List<Passenger> passengers, String filePath) {
        File file = new File(filePath);


        file.getParentFile().mkdirs();

        try (PrintWriter printWriter = new PrintWriter(file)) {
            String header = "passengerId, gender, pclass, survived, age";
            printWriter.println(header);
            for (Passenger passenger : passengers) {
                String csv = "";
                csv += passenger.getPassengerId() + ",";
                csv += passenger.getGender() + ",";
                csv += passenger.getPclass() + ",";
                csv += passenger.getSurvived() + ",";
                csv += passenger.getAge();
                printWriter.println(csv);
            }
            printWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
