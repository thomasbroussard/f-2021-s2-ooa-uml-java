package fr.epita.exam.launchers;

import fr.epita.exam.datamodel.Passenger;
import fr.epita.exam.services.PassengerCSVDAO;

import java.util.List;

public class TestSER3 {

    public static void test(){
        PassengerCSVDAO passengerCSVDAO = new PassengerCSVDAO();
        List<Passenger> passengers = passengerCSVDAO.readAll();
        passengerCSVDAO.write(passengers);

    }
}
