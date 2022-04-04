package fr.epita.datastructures.tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String,Student> studentsByEmail = new LinkedHashMap<>();
        studentsByEmail.put("thomas@thomas.com", new Student("thomas"));
        studentsByEmail.put("quentin@quentin.com", new Student("quentin"));
        studentsByEmail.put("romain@quentin.com", new Student("romain"));
        System.out.println(studentsByEmail);
    }

}
