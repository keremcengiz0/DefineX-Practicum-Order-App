package com.keremcengiz0.services;

import com.keremcengiz0.entities.CorporateCustomer;
import com.keremcengiz0.entities.IndividualCustomer;
import java.util.HashSet;
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
                                    "Invoices Id: " + invoice.getId() +
                                    ", Price: " + invoice.getPrice() +
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
                                    "Invoices Id: " + invoice.getId() +
                                            ", Price: " + invoice.getPrice() +
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
                                        "Invoices Id: " + invoice.getId() +
                                                ", Price: " + invoice.getPrice() +
                                                ", Invoice Date: " + invoice.getInvoiceDate()).collect(Collectors.toList()) +
                                "}"
                );
            }
        }
    }




}
