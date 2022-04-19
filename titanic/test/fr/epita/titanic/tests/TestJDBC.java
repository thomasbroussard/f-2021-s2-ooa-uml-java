package fr.epita.titanic.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestJDBC {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");){
            String schema = connection.getSchema();
            if (schema.equalsIgnoreCase("public")){
                System.out.println("successfully connected to the DB");
            }
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PASSENGERS(PASSENGER_ID, SURVIVED, GENDER, AGE, PCLASS) VALUES(2,false,'male',22,3)");
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
