package fr.epita.titanic.launchers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./titanic/titanic.csv");
        if (file.exists()){
            System.out.println("the file has been found!");
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] split = line.split(",");

            String passengerId = split[0];
            String survived = split[1];
            String pclass = split[2];
            String gender = split[3];


        }

    }
}
