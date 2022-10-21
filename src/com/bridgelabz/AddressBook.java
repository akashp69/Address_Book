package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    Contacts obj = new Contacts();
    public void Contacts() {
        System.out.println("Enter Details for Creating Contacts");
        System.out.println("Enter First Name");
        obj.setFirstname(sc.next());
        System.out.println("Enter last Name");
        obj.setLastname(sc.next());
        System.out.println("Enter Address");
        obj.setAddress(sc.next());
        System.out.println("Enter State");
        obj.setState(sc.next());
        System.out.println("Enter Zip");
        obj.setZip(sc.nextInt());
        System.out.println("Enter Phone no");
        obj.setPhonenumber(sc.nextLong());
        System.out.println("Enter E-mail");
        obj.setEmail(sc.next());

    }



}
