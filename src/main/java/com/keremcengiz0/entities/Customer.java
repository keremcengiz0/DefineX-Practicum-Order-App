package com.keremcengiz0.entities;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Customer {
    private int id;
    private LocalDate registrationDate;
    private List<Invoice> invoices;

    // Invoice... invoices means to take the invoices as a string array and add them as a list in the constructor.
    public Customer(int id, LocalDate registrationDate, Invoice... invoices) {
        this.id = id;
        this.registrationDate = registrationDate;
        this.invoices = new ArrayList<>(Arrays.asList(invoices));
    }

    @Override
    public String toString() {
        return "Customer id=" + id +
                ", Registration Date= " + registrationDate +
                '}';
    }
}
