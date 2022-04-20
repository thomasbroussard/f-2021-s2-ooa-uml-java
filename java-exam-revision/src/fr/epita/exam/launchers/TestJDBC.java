package fr.epita.exam.launchers;

import fr.epita.exam.datamodel.Passenger;
import fr.epita.exam.services.PassengerJDBCDAO;

import java.util.List;

public class TestJDBC {

    public static void test(){

        PassengerJDBCDAO dao = new PassengerJDBCDAO();
        List<Passenger> passengers = dao.readAll();
        System.out.println(passengers);

    }
}
