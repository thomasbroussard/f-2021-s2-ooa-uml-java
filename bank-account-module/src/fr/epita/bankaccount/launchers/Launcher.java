package fr.epita.bankaccount.launchers;


import fr.epita.bankaccount.datamodel.Customer;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("hello world");
        Customer thomas = new Customer("Thomas", "Paris");
        Customer quentin = new Customer("Quentin","Paris");

        System.out.println(thomas);
        System.out.println(quentin);


        Scanner scanner = new Scanner(System.in);

        System.out.println("hello, please input a customer name: ");
        String line = scanner.nextLine();
        System.out.println("this is what you have typed: "+ line);


    }
}
