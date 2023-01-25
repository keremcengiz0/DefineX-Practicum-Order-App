package com.keremcengiz0.entities;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CorporateCustomer extends Customer {
    private String name;
    private String sector;

    public CorporateCustomer(int id, LocalDate registrationDate, String name, String sector, Invoice... invoices) {
        super(id, registrationDate, invoices);
        this.name = name;
        this.sector = sector;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "Company Name='" + name + '\'' +
                ", Sector='" + sector + '\'' +
                '}';
    }
}
