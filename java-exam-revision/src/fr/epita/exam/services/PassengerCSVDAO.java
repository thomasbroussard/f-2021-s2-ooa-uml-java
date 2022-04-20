package fr.epita.exam.services;

import fr.epita.exam.datamodel.Passenger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PassengerCSVDAO {

    public List<Passenger> readAll(){
        File file = new File("java-exam-revision/data.csv");

        // read all the lines at once by this Files class function
        // Files.readAllLines(file.toPath());

        List<Passenger> passengers = new ArrayList<>();
        try(Scanner scanner = new Scanner(file); ) {
            scanner.nextLine(); //skip the header line
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                try {
                    String[] split = line.split(";");
                    String name = split[0].trim();
                    String pClass = split[1].trim();
                    Double age = Double.parseDouble(split[2].trim());
                    String sex = split[3].trim();
                    boolean survived = "1".equals(split[4].trim());
                    Passenger passenger = new Passenger(name,pClass, age, sex, survived);
                    passengers.add(passenger);
                }catch (Exception e){
                    System.out.println("problem while dealing with this line: "+ line);
                    e.printStackTrace(); // this is just printing the error, the while loop is not interrupted
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (!passengers.isEmpty()){
            passengers.sort(new Comparator<Passenger>() {
                @Override
                public int compare(Passenger o1, Passenger o2) {
                    return  Double.valueOf(o2.getAge() - o1.getAge()).intValue();
                }
            });
        }
        return passengers;

    }
}
