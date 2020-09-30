package com.company.model.people;

public class Customer extends Person{
    public Customer(String name, String login, String password) {
        super(name, login, password);
        role = PersonRole.Customer;
    }

    @Override
    public void about() {
        System.out.println("this is customer; name: " +name);
    }
}
