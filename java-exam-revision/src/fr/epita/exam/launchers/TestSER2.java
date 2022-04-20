package fr.epita.exam.launchers;

import fr.epita.exam.datamodel.Passenger;
import fr.epita.exam.services.PassengerCSVDAO;

import java.util.List;

public class TestSER2 {


    public static void test(){
        PassengerCSVDAO dao = new PassengerCSVDAO();
        List<Passenger> passengers = dao.readAll();
        System.out.println(passengers);
    }
}
