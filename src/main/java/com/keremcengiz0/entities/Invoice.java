package com.keremcengiz0.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Invoice {
    private int id;
    private double price;
    private LocalDate invoiceDate;

    public Invoice(int id, double price, LocalDate invoiceDate) {
        this.id = id;
        this.price = price;
        this.invoiceDate = invoiceDate;
    }
}
