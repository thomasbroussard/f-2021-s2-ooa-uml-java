package fr.epita.exam.launchers;

import fr.epita.exam.datamodel.PassengerClass;

public class Launcher {

    public static void main(String[] args) {
        TestDMO2.test();
        TestSER1.test();
        TestSER2.test();
        TestSER3.test();
        TestJDBC.test();
    }
}
