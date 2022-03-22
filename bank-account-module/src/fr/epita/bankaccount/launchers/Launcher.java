package fr.epita.bankaccount.launchers;


import fr.epita.bankaccount.datamodel.Account;
import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.InvestmentAccount;
import fr.epita.bankaccount.datamodel.SavingsAccount;

import java.math.BigDecimal;
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
        String name = scanner.nextLine();

        System.out.println("please input the customer address: ");
        String address = scanner.nextLine();

        Customer customerFromConsole = new Customer(name,  address);
        System.out.println("about to create this customer: " + customerFromConsole);

        customerFromConsole.setName("123");

        SavingsAccount account = new SavingsAccount(123);

        InvestmentAccount investmentAccount = new InvestmentAccount(456);
    }
}
