package com.keremcengiz0.services;

import com.keremcengiz0.entities.CorporateCustomer;
import com.keremcengiz0.entities.IndividualCustomer;
import com.keremcengiz0.entities.Invoice;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class CustomerManager {
    private Set<IndividualCustomer> individualCustomers;
    private Set<CorporateCustomer> corporateCustomers;

    public Set<IndividualCustomer> getIndividualCustomers() {
        return individualCustomers;
    }

    public void setIndividualCustomers(Set<IndividualCustomer> individualCustomers) {
        this.individualCustomers = individualCustomers;
    }

    public Set<CorporateCustomer> getCorporateCustomers() {
        return corporateCustomers;
    }

    public void setCorporateCustomers(Set<CorporateCustomer> corporateCustomers) {
        this.corporateCustomers = corporateCustomers;
    }

    public CustomerManager() {
        this.individualCustomers = new HashSet<IndividualCustomer>();
        this.corporateCustomers = new HashSet<CorporateCustomer>();
    }


    // This method adds individual customers
    public void addIndividualCustomer(IndividualCustomer customer) {
        individualCustomers.add(customer);
    }

    // This method adds corporate customers
    public void addCorporateCustomer(CorporateCustomer customer) {
        corporateCustomers.add(customer);
    }

    // This method lists all customers
    public void getAllCustomers() {
        System.out.println("---------- Individual Customer List ----------");
        for(IndividualCustomer individualCustomer : individualCustomers) {
            System.out.println(
                    individualCustomer.toString() +
                            " Invoices{ " + individualCustomer.getInvoices()
                            .stream().map(invoice ->
                                    "Invoice Id: " + invoice.getId() +
                                    ", Price: " + invoice.getPrice() + " ₺" +
                                    ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                            "}"
                    );
        }

        System.out.println("---------- Corporate Customer List ----------");
        for(CorporateCustomer corporateCustomer : corporateCustomers) {
            System.out.println(
                    corporateCustomer.toString() +
                            " Invoices{ " + corporateCustomer.getInvoices()
                            .stream().map(invoice ->
                                    "Invoice Id: " + invoice.getId() +
                                            ", Price: " + invoice.getPrice() + " ₺" +
                                            ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                            "}"
            );
        }
    }

    // This method lists all customers contains 'C'
    public void getAllCustomersContainsC() {
        for(IndividualCustomer individualCustomer : individualCustomers) {
            if(individualCustomer.getFirstName().toUpperCase().contains("C")) {
                System.out.println(
                        individualCustomer.toString() +
                                " Invoices{ " + individualCustomer.getInvoices()
                                .stream().map(invoice ->
                                        "Invoice Id: " + invoice.getId() +
                                                ", Price: " + invoice.getPrice() + " ₺" +
                                                ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                                "}"
                );
            }
        }
    }

    // This method calculate the total price of invoices for customers who signed up in June.
    public void getAllCustomersInvoicesTotalWhoSignedUpInJune() {
        double totalPrice = 0.0;

        for (IndividualCustomer individualCustomer : individualCustomers) {
            if(individualCustomer.getRegistrationDate().getMonth() == Month.JUNE) {
                List<Invoice> invoices = individualCustomer.getInvoices().stream().collect(Collectors.toList());
                for (Invoice invoice : invoices) {
                    totalPrice += invoice.getPrice();
                }
            }
        }

        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            if(corporateCustomer.getRegistrationDate().getMonth() == Month.JUNE) {
                List<Invoice> invoices = corporateCustomer.getInvoices().stream().collect(Collectors.toList());
                for (Invoice invoice : invoices) {
                    totalPrice += invoice.getPrice();
                }
            }
        }

        System.out.println("Total amount of invoices for customers who signed up in June: " + totalPrice + " ₺");
    }


    public void getAllInvoices() {

        for (IndividualCustomer individualCustomer : individualCustomers) {
            System.out.println(
                            " Invoices{ " + individualCustomer.getInvoices()
                            .stream().map(invoice ->
                                    "Invoice Id: " + invoice.getId() +
                                            ", Price: " + invoice.getPrice() + " ₺" +
                                            ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                            "}"
            );
        }

        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            System.out.println(
                            " Invoices{ " + corporateCustomer.getInvoices()
                            .stream().map(invoice ->
                                    "Invoice Id: " + invoice.getId() +
                                            ", Price: " + invoice.getPrice() +
                                            ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                            "}"
            );
        }
    }

    // This method lists all customers contains 'C'
    public void getAllCustomersInvoicesOver1500() {
        System.out.println("---------- Individual customers with invoice amount over 1500 TL ----------");

        for(IndividualCustomer individualCustomer : individualCustomers) {
            List<Invoice> invoices = individualCustomer.getInvoices().stream().filter(invoice -> invoice.getPrice() > 1500).collect(Collectors.toList());
            if(invoices.size() > 0) {
                System.out.println(
                                " Invoices{ " + invoices
                                .stream().map(invoice ->
                                        "Invoice Id: " + invoice.getId() +
                                                ", Price: " + invoice.getPrice() + " ₺" +
                                                ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                                "}"
                );
            }
        }

        System.out.println("---------- Corporate customers with invoice amount over 1500 TL ----------");

        for(CorporateCustomer corporateCustomer : corporateCustomers) {
            List<Invoice> invoices = corporateCustomer.getInvoices().stream().filter(invoice -> invoice.getPrice() > 1500).collect(Collectors.toList());
            if(invoices.size() > 0) {
                System.out.println(
                        " Invoices{ " + invoices
                                .stream().map(invoice ->
                                        "Invoice Id: " + invoice.getId() +
                                                ", Price: " + invoice.getPrice() + " ₺" +
                                                ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                                "}"
                );
            }
        }
    }



}
