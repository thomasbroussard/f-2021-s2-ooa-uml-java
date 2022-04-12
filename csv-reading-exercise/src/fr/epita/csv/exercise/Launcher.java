package fr.epita.csv.exercise;

import java.io.File;
import java.util.Properties;

public class Launcher {

    public static void main(String[] args) {

        // Task1
        File file = new File("csv-reading-exercise/test.csv");
        if (!file.exists()){
            System.out.println("file does not exist");
            return;
        }
        System.out.println("file exists, ready to continue");



    }
}
