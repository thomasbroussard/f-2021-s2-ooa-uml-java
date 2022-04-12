package fr.epita.titanic.service;

import fr.epita.titanic.datamodel.Passenger;

import java.io.*;
import java.util.*;

public class PassengersCSVDAO {

    public static final String SURVIVED_KEY = "survived";
    public static final String NOT_SURVIVED_KEY = "not-survived";
    private final String filePath;


    public PassengersCSVDAO(String filePath){
        this.filePath = filePath;
    }

    public List<Passenger> search(Passenger example) {
        File file = new File(filePath);
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


    public void create(Passenger passenger) {

        File file = new File(filePath);
        file.getAbsoluteFile().getParentFile().mkdirs();

        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(file, true))) {
            // check if header is to be printed or not based on what?
            String header = "passengerId, gender, pclass, survived, age";
            printWriter.println(header);

            String csv = "";
            csv += passenger.getPassengerId() + ",";
            csv += passenger.getGender() + ",";
            csv += passenger.getPclass() + ",";
            csv += passenger.getSurvived() + ",";
            csv += passenger.getAge();
            printWriter.println(csv);

            printWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
