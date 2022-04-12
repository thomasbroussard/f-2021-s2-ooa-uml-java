import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.service.PassengersDataService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TestPassengersDataService {

    public static void main(String[] args) throws FileNotFoundException {
        whenWeSaveListOfPassengers_ThenACsvFileShouldBeUpdated();




        //whenCsvContains3ValidPassengers_ThenReturnedListSizeIs3();

    }

    private static void whenWeSaveListOfPassengers_ThenACsvFileShouldBeUpdated() {
        //given
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = new Passenger("0", true, "2", "male",20);
        Passenger passenger2 = new Passenger("0", true, "1", "female",21);

        passengers.add(passenger1);
        passengers.add(passenger2);

        //when
        PassengersDataService.writeAsCsv(passengers, "newCsv.csv");

        //Then
        File file = new File("newCsv.csv");
        boolean fileExists = file.exists();
        if (!fileExists){
            System.out.println("error!!");
        }else{
            System.out.println("success!");
        }


    }


    private static void whenCsvContains3ValidPassengers_ThenReturnedListSizeIs3() throws FileNotFoundException {
        //given
        File fileContaining3Entries = new File("./titanic/test/samplePassengers.csv");

        //when
        List<Passenger> passengers = PassengersDataService.readPassengersFromFile(fileContaining3Entries);

        //then
        assert passengers.size() == 3;
    }

    private static void whenFileDoesNotExist_ThenAnExceptionIsThrown() {

        PassengersDataService.readPassengersFromFile(new File("abc"));

    }

}
