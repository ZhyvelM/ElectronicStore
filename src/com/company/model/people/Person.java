package com.company.model.people;

public abstract class Person {
    String name;
    String login;
    String password;
    PersonRole role;

    public Person(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public abstract void about();
}
