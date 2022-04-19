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
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PASSENGERS(PASSENGER_ID, SURVIVED, GENDER, AGE, PCLASS) VALUES(?, ?,?,?,?)");
            preparedStatement.setInt(1, 3);
            preparedStatement.setBoolean(2, false);
            preparedStatement.setString(3, "male");
            preparedStatement.setInt(4, 50);
            preparedStatement.setInt(5, 3);
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
