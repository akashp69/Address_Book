package com.bridgelabz;

import java.util.Scanner;

public class AddressBook extends Contacts {
    Scanner sc = new Scanner(System.in);


    public void contacts() {
        System.out.println("Enter Details for Creating Contacts");
        System.out.println("Enter First Name");
        setFirstname(sc.next());
        System.out.println("Enter last Name");
        setLastname(sc.next());
        System.out.println("Enter Address");
        setAddress(sc.next());
        System.out.println("Enter State");
        setState(sc.next());
        System.out.println("Enter Zip");
        setZip(sc.nextInt());
        System.out.println("Enter Phone no");
        setPhonenumber(sc.nextLong());
        System.out.println("Enter E-mail");
        setEmail(sc.next());


        System.out.println("Check Added Contact Details");
        System.out.println("\n First Name "+getFirstname());
        System.out.println("\n Last Name "+getLastname());
        System.out.println("\n Address "+getAddress());
        System.out.println("\n State "+getState());
        System.out.println("\n Zip "+getZip());
        System.out.println("\n Phone Number  "+getPhonenumber());
        System.out.println("\nE-mail id "+getEmail());
    }



}
