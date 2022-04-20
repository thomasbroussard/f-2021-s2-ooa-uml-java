package fr.epita.exam.services;

import fr.epita.exam.datamodel.Passenger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerJDBCDAO {


    public void create(Passenger passenger){
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PASSENGERS (passsenger_id, survived, age, pclass, gender ) VALUES (?, ?, ?, ?, ?)");
            //should be set manually
            preparedStatement.setInt(1, 10);

            preparedStatement.setBoolean(2,passenger.isSurvived());
            preparedStatement.setDouble(3, passenger.getAge());

            preparedStatement.setString(4, passenger.getPclass());
            preparedStatement.setString(5, passenger.getSex());

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Passenger> readAll(){
        List<Passenger> passengers = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            PreparedStatement preparedStatement = connection.prepareStatement("select passenger_id, survived, age, pclass, gender from PASSENGERS");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int passenger_id = resultSet.getInt("passenger_id");
                boolean survived = resultSet.getBoolean("survived");
                double age = resultSet.getDouble("age");
                String pclass = resultSet.getString("pclass");
                String gender = resultSet.getString("gender");
                passengers.add(new Passenger(String.valueOf(passenger_id), pclass, age, gender, survived));
            }

            preparedStatement.execute();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passengers;

    }

}
