package org.iamflinks.javachallenge;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize base contacts.
        HashMap<String, String> contacts = new HashMap<>();
        HashMap<String, String> messages = new HashMap<>();

        contacts.put("Femi", "6036175967");
        contacts.put("Tosin", "+2348144965933");
        contacts.put("Elias", "6035182596");
        contacts.put("Andrew", "702598632");
        contacts.put("Matt", "021045798");

        messages.put("Femi", "Lorem Ipsum is simply dummy text of the printing\n" +
                " and typesetting industry. Lorem Ipsum has been the industry's\n" +
                " standard dummy text ever since the 1500s, when an unknown printer\n" +
                " took a galley of type and scrambled it to make a type specimen\n" +
                " book. It has survived not only five centuries, but also the leap\n" +
                " into electronic typesetting, remaining essentially unchanged.\n" +
                " It was popularised in the 1960s with the release of Letraset");
        messages.put("Tosin", "Lorem Ipsum is simply dummy text of the printing\n" +
                " and typesetting industry. Lorem Ipsum has been the industry's\n" +
                " standard dummy text ever since the 1500s, when an unknown printer\n" +
                " took a galley of type and scrambled it to make a type specimen\n" +
                " book. It has survived not only five centuries, but also the leap\n" +
                " into electronic typesetting, remaining essentially unchanged.\n" +
                " It was popularised in the 1960s with the release of Letraset");
        messages.put("Elias", "Lorem Ipsum is simply dummy text of the printing\n" +
                " and typesetting industry. Lorem Ipsum has been the industry's\n" +
                " standard dummy text ever since the 1500s, when an unknown printer\n" +
                " took a galley of type and scrambled it to make a type specimen\n" +
                " book. It has survived not only five centuries, but also the leap\n" +
                " into electronic typesetting, remaining essentially unchanged.\n" +
                " It was popularised in the 1960s with the release of Letraset");
        messages.put("Andrew", "Lorem Ipsum is simply dummy text of the printing\n" +
                " and typesetting industry. Lorem Ipsum has been the industry's\n" +
                " standard dummy text ever since the 1500s, when an unknown printer\n" +
                " took a galley of type and scrambled it to make a type specimen\n" +
                " book. It has survived not only five centuries, but also the leap\n" +
                " into electronic typesetting, remaining essentially unchanged.\n" +
                " It was popularised in the 1960s with the release of Letraset");
        messages.put("Matt", "Lorem Ipsum is simply dummy text of the printing\n" +
                " and typesetting industry. Lorem Ipsum has been the industry's\n" +
                " standard dummy text ever since the 1500s, when an unknown printer\n" +
                " took a galley of type and scrambled it to make a type specimen\n" +
                " book. It has survived not only five centuries, but also the leap\n" +
                " into electronic typesetting, remaining essentially unchanged.\n" +
                " It was popularised in the 1960s with the release of Letraset");

        Contacts.contactList = contacts;
        Message.messageList = messages;

        Phone contactInterface  = new Contacts();
        Phone messageInterface = new Message();
        // Getting input from the user
        Scanner scanner = new Scanner(System.in);

        boolean isQuit= false;
        boolean home= false;
        // Logic of the Phone App
        System.out.println("Welcome to the Phone App");
        while (!isQuit) {
            while (!home) {
                System.out.println("1. Manage Contacts \t 2. Messages \t 3. Quit");
                home = true;
            }
            System.out.print("Please select any of the options above: ");
            int option = scanner.nextInt();
            // If the user enters invalid number
            if (option < 1 && home) {
                System.out.println("Please enter a number from 1 to 3");
                home = false;
            }
            // Quit the app is 3 or number less than 1 is entered
            if (option >= 3) {
                System.out.println("Thank you for using the Phone App!");
                isQuit = true;
            }
            else if (option==1) {
                contactInterface.previousMenu(2);
                System.out.print("Please select any of the options above: ");
                int action = scanner.nextInt();
                if (action == 1) {
                    contactInterface.show();
                    contactInterface.previousMenu(1);
                } else if (action == 2) {
                    System.out.print("Please enter the contact name: ");
                    String name = scanner.next();
                    System.out.print("Please enter the contact number: ");
                    String number = scanner.next();
                    System.out.println(contactInterface.newMS(name, number));
                    contactInterface.previousMenu(1);
                } else if (action == 3) {
                    System.out.print("Please enter the contact you intend to search for: ");
                    String name = scanner.next();
                    String number = contactInterface.search(name);
                    System.out.println("Name: " + name + " Number: " + number);
                    contactInterface.previousMenu(1);
                } else if (action == 4) {
                    System.out.print("Please enter the contact you intend to delete: ");
                    String name = scanner.next();
                    System.out.println(contactInterface.delete(name));
                    contactInterface.previousMenu(1);
                } else if (action == 5) {
                    contactInterface.previousMenu(1);
                }
            }
            else if (option==2) {
                messageInterface.previousMenu(2);
                System.out.print("Please select any of the options above: ");
                int action = scanner.nextInt();
                if (action == 1) {
                    messageInterface.show();
                    messageInterface.previousMenu(1);
                } else if (action == 2) {
                    System.out.print("Please enter the contact name: ");
                    String name = scanner.next();
                    System.out.print("Please enter the message content (\\n represents new line): ");
                    String number = scanner.next();
                    System.out.println(messageInterface.newMS(name, number));
                    messageInterface.previousMenu(1);
                } else if (action == 3) {
                    System.out.print("Please enter the name you intend to search for: ");
                    String name = scanner.next();
                    String number = messageInterface.search(name);
                    System.out.println("Name: " + name + " Contents: " + number);
                    messageInterface.previousMenu(1);

                }
            }
        }
    }
}
