package org.iamflinks.javachallenge;

import java.util.HashMap;

public class Message implements Phone {

    public static HashMap<String, String> messageList = new HashMap<>();

    @Override
    public void show() {
        for (String names : messageList.keySet()) {
            System.out.println("Name: " + names + " Message content: " + messageList.get(names));
        }
    }

    @Override
    public String newMS(String name, String content) {
        if (name != null && content!=null) {
            messageList.put(name, content);
            return "Your message has successfully been sent to " + name;
        } else {
            return "One of the input in NULL";
        }
    }

    @Override
    public void previousMenu(int state) {
        if (state==1) {
            System.out.println("<<<<<< Phone App >>>>>>");
            System.out.println("Please select any of the options below:");
            System.out.println("1. Manage Contacts \t 2. Messages \t 3. Quit");
        }
        if (state==2) {
            System.out.println("\t 1. See the list of messages");
            System.out.println("\t 2. Send a new message");
            System.out.println("\t 3. Go back to the previous menu");
        }
    }
    public String search(String name) {
        return "";
    }
    public String delete(String name) {
        return "";
    }
}
