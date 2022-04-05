import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.service.PassengersDataService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class TestPassengersDataService {

    public static void main(String[] args) throws FileNotFoundException {
        whenCsvContains3ValidPassengers_ThenReturnedListSizeIs3();

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
        Exception e = null;
        try {
            PassengersDataService.readPassengersFromFile(new File("abc"));
        } catch (FileNotFoundException fe){
            e = fe;
        }
        assert e!= null;
    }

}
