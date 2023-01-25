package com.keremcengiz0.entities;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class IndividualCustomer extends Customer {
    private String firstName;
    private String lastName;

    public IndividualCustomer(int id, LocalDate registrationDate, String firstName, String lastName, Invoice... invoices) {
        super(id, registrationDate, invoices);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" +
                super.toString() +
                " Name= " + firstName +
                ", Surname= " + lastName +
                '}';
    }
}
