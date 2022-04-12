import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.service.PassengersCSVDAO;
import fr.epita.titanic.service.PassengersDataService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPassengersDAO {


    public static void main(String[] args) throws FileNotFoundException {
        //given
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = new Passenger("0", true, "2", "male",20);
        Passenger passenger2 = new Passenger("0", true, "1", "female",21);

        passengers.add(passenger1);
        passengers.add(passenger2);

        //when
        PassengersCSVDAO dao = new PassengersCSVDAO("newCsv.csv");
        for (Passenger passenger : passengers){
            dao.create(passenger);
        }

        //Then
        File file  = new File("newCsv.csv");
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        String firstDataLine = scanner.nextLine();
        String whatShouldBeAtFirstLine = "0,male,2,true,20.0";


        if (firstDataLine.equals(whatShouldBeAtFirstLine)){
            System.out.println("whenWeSaveListOfPassengers_ThenACsvFileShouldBeUpdated:      ok");
        }else{
            System.out.println("whenWeSaveListOfPassengers_ThenACsvFileShouldBeUpdated:      ko");
        }
    }
}

