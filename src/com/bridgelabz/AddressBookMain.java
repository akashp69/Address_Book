package com.bridgelabz;

import com.bridgelabz.AddressBook;
import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome In Address Book System Program ");
        String firstName, lastName, address, city, state, email;
        int zip;
        long phoneNo;
        Scanner sc = new Scanner(System.in);
        AddressBook contact = new AddressBook();
        System.out.print("Enter First Name  : ");
        firstName = sc.nextLine();
        contact.setFirstName(firstName);
        System.out.print("\nEnter Last Name  : ");
        lastName = sc.nextLine();
        contact.setLastName(lastName);
        System.out.print("\nEnter E-mail  : ");
        email = sc.nextLine();
        contact.setEmail(email);
        System.out.print("\nEnter Address  : ");
        address = sc.nextLine();
        contact.setAddress(address);
        System.out.print("\nEnter City  : ");
        city = sc.nextLine();
        contact.setCity(city);
        System.out.print("\nEnter State  : ");
        state = sc.nextLine();
        contact.setState(state);
        System.out.print("\nEnter Phone Number  : ");
        phoneNo = sc.nextLong();
        contact.setPhoneNo(phoneNo);
        System.out.print("\nEnter Zip  : ");
        zip = sc.nextInt();
        contact.setZip(zip);

        Console console = new Console();
        console.showContact(contact);
        System.out.print("\nDo you want to edit? press 1 for Edit  / 2 for Not : ");
        char editOption = sc.next().charAt(0);
        if (editOption == '1') {
            console.editContact(contact);
        }
        console.showContact(contact);
        System.out.print("\nDo you want to delete? press 1 For Delet / 2 for Not: ");
        char deleteOption = sc.next().charAt(0);
        if (deleteOption == '1') {
            contact = console.deleteContact(contact);
        }
        console.showContact(contact);
        sc.close();
    }
}