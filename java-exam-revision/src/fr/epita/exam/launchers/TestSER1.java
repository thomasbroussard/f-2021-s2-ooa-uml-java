package fr.epita.exam.launchers;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSER1 {


    public static void test(){
        File file = new File("java-exam-revision/data.csv");

        // read all the lines at once by this Files class function
        // Files.readAllLines(file.toPath());

        try(Scanner scanner = new Scanner(file); ) {
            scanner.nextLine(); //skip the header line
            List<String> lines = new ArrayList<>();
            while (scanner.hasNext()){
                lines.add(scanner.nextLine());
            }

            System.out.println(lines.get(0));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
