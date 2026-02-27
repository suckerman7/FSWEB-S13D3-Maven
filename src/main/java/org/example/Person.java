package org.example;

public class Person {
    String firstName;
    String lastName;
    String birthPlace;
    String zodiac;
    int age;
    double salary;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String birthPlace, String zodiac, double salary) {
        this("Mert", "Yüksel", 23);
        this.birthPlace = birthPlace;
        this.zodiac = zodiac;
        this.salary = salary;
    }

    public Person() {
        this("Şişli", "Boğa", 250.00);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        }

        return false;
    }
}
