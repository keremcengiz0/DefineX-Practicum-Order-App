package com.keremcengiz0;

import com.keremcengiz0.entities.CorporateCustomer;
import com.keremcengiz0.entities.Customer;
import com.keremcengiz0.entities.IndividualCustomer;
import com.keremcengiz0.entities.Invoice;
import com.keremcengiz0.services.CustomerManager;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        // The customerManager object is created.
        CustomerManager customerManager = new CustomerManager();

        // 3 Individual customer object is created and added to the list.

        Customer CI1 = new IndividualCustomer(1, LocalDate.of(2023, Month.JANUARY,10),"Kerem","Cengiz",
                new Invoice(1,1499.99,LocalDate.of(2023,Month.FEBRUARY,18)),
                new Invoice(2,875.50,LocalDate.of(2023,Month.JUNE,25)));

        customerManager.addIndividualCustomer((IndividualCustomer) CI1);

        Customer CI2 = new IndividualCustomer(2, LocalDate.of(2021, Month.FEBRUARY,15),"Ceren","Yılmaz",
                new Invoice(3,2855.46,LocalDate.of(2023,Month.JUNE,20)),
                new Invoice(4,448.25,LocalDate.of(2022,Month.JULY,25)));

        customerManager.addIndividualCustomer((IndividualCustomer) CI2);


        Customer CI3 = new IndividualCustomer(3, LocalDate.of(2019, Month.JANUARY,1),"Hilal","Cengiz",
                new Invoice(5,4499.99,LocalDate.of(2023,Month.JUNE,9)),
                new Invoice(6,3350.85,LocalDate.of(2020,Month.AUGUST,31)));

        customerManager.addIndividualCustomer((IndividualCustomer) CI3);


        // 3 Corporate customer object is created and added to the list.

        Customer CO4 = new CorporateCustomer(4, LocalDate.of(2010, Month.JANUARY,1),"Anadolu Ağız Ve Diş Sağlığı","Sağlık",
                new Invoice(7,50000.00,LocalDate.of(2021,Month.MARCH,17)),
                new Invoice(8,185575.00,LocalDate.of(2023,Month.JUNE,8)));

        customerManager.addCorporateCustomer((CorporateCustomer) CO4);


        Customer CO5 = new CorporateCustomer(5, LocalDate.of(2007, Month.JANUARY,1),"Patika","Eğitim",
                new Invoice(9,85000.00,LocalDate.of(2013,Month.MAY,21)),
                new Invoice(10,120000.00,LocalDate.of(2018,Month.JUNE,11)));
        customerManager.addCorporateCustomer((CorporateCustomer) CO5);


        Customer CO6 = new CorporateCustomer(6, LocalDate.of(2019, Month.JANUARY,1),"DefineX","Danışmanlık, Tejnoloji ",
                new Invoice(11,980000.00,LocalDate.of(2020,Month.JUNE,1)),
                new Invoice(12,1200000.00,LocalDate.of(2021,Month.DECEMBER,28)));

        customerManager.addCorporateCustomer((CorporateCustomer) CO6);


        //customerManager.getAllCustomers();
        //customerManager.getAllCustomersContainsC();

    }
}