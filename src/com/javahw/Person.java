package com.javahw;

import java.util.Calendar;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String dataOfBirth;
    private String fullName;

    public Person(String surname, String name, String patronymic, String dataOfBirth) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dataOfBirth = dataOfBirth;
    }

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String fullName, String dataOfBirth) {
        String[] info = fullName.split(" ");
        this.surname = info[0];
        this.name = info[1];
        this.patronymic = info[2];
        this.dataOfBirth = dataOfBirth;
    }

    public String getFullName() {
        return this.surname + " " + this.name + " " + this.patronymic;
    }

    public String getShortName() {
        return this.surname + " " + this.name.charAt(0) + "." + this.patronymic.charAt(0);
    }

    public int getFullYears() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearOfBirth = Integer.parseInt(this.dataOfBirth.substring(this.dataOfBirth.length() - 4));
        return currentYear - yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person { " +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", dataOfBirth = '" + dataOfBirth + '\'' +
                " }";
    }
}