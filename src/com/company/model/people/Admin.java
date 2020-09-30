package com.company.model.people;

public class Admin extends Person{
    public Admin(String name, String login, String password) {
        super(name, login, password);
        role = PersonRole.Admin;
    }

    @Override
    public void about() {
        System.out.println("this is admin; name: " + name);
    }
}
