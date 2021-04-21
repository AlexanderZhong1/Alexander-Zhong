package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class friend {
    public String firstName;
    public String lastName;

    public friend(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
