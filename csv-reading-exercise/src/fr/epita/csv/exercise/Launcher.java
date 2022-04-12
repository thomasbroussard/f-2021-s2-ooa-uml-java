package fr.epita.csv.exercise;

import fr.epita.csv.exercise.datamodel.StudentGrade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) throws FileNotFoundException {

        // Task1
        File file = new File("csv-reading-exercise/test.csv");
        if (!file.exists()){
            System.out.println("file does not exist");
            return;
        }
        System.out.println("file exists, ready to continue");

        //Task2
        Scanner scanner = new Scanner(file);


        List<StudentGrade> studentGradeList = new ArrayList<>();

        //Task4
        while (scanner.hasNext()){
            //Task3
            String line = scanner.nextLine();
            System.out.println(line);

            //Task5
            String[] lineCells = line.split(";");

            String name = lineCells[0];
            String grade = lineCells[1];

            //Task7
            StudentGrade studentGrade = new StudentGrade(name, grade);
            studentGradeList.add(studentGrade);
        }

        //Task8
        System.out.println(studentGradeList);


    }
}
