package fr.epita.bankaccount.datamodel;

//this is a class to describe a customer
public class Customer{
    private String name;
    private String address;


    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
