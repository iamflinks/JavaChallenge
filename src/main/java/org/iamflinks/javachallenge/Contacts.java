package org.iamflinks.javachallenge;

import java.util.HashMap;

public class Contacts implements Phone {

    public static HashMap<String, String> contactList = new HashMap<>();

    public static HashMap<String, String> getContactList() {
        return contactList;
    }

    public static void setContactList(HashMap<String, String> contactList) {
        Contacts.contactList = contactList;
    }

    @Override
    public String search(String name) {
        return contactList.getOrDefault(name, "Contact not found.");
//        if (contactList.containsKey(name)) {
//            return contactList.get(name);
//        }
//        else {return "Contact not found.";}
    }

    @Override
    public String delete(String name) {
        if (contactList.containsKey(name)) {
            contactList.remove(name);
            return name + " has been removed from the contact list";
        }
        else {return name + " is not in the contact list.";}
    }

    @Override
    public void show() {
        if (contactList.isEmpty()) {
            System.out.println("The contact list is empty. Please add numbers to the contact list");
        }
        else {
            for (String names : contactList.keySet()) {
                System.out.println("Name: " + names + " Phone Number: " + contactList.get(names));
            }
        }
    }

    @Override
    public String newMS(String name, String content) {
        if (name != null && content!=null) {
            contactList.put(name, content);
            return name + " has been added to the contact successfully";
        } else {
            return "One of the input in NULL";
        }
    }

    @Override
    public void previousMenu(int state) {
        if (state==1) {
            System.out.println("\n<<<<<< Phone App >>>>>>");
            System.out.println("Please select any of the options below:");
            System.out.println("1. Manage Contacts \t 2. Messages \t 3. Quit");
        }
        if (state==2) {
            System.out.println("\t 1. Show all contacts");
            System.out.println("\t 2. Add new contact");
            System.out.println("\t 3. Search for contact");
            System.out.println("\t 4. Delete a contact");
            System.out.println("\t 5. Go back to previous menu");
        }
    }
}
