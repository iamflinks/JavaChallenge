package org.iamflinks.javachallenge;

import java.util.HashMap;

public abstract class PhoneABS {
    public static HashMap<String, String> contactList = new HashMap<>();
    public static HashMap<String, String> messageList = new HashMap<>();
    public void show() {

    }
    String newMS(String name, String content) {
        return name;
    }
    void previousMenu( int state) {

    }
    String search(String name){
        return name;
    }
    String delete(String name) {
        return name;
    }

}
