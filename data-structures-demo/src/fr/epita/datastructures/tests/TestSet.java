package fr.epita.datastructures.tests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        duplicateDemo();

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("thomas"));
        students.add(new Student("thomas"));

        System.out.println(students);

    }

    private static void duplicateDemo() {
        Set<String> set = new LinkedHashSet<>();
        set.add("this");
        set.add("is");
        set.add("a");
        set.add("test");
        set.add("this");

        System.out.println(set);
    }
}
