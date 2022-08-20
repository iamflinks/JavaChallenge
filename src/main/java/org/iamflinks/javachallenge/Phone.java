package org.iamflinks.javachallenge;

import java.util.HashMap;

public interface Phone {
    void show();
    String newMS(String name, String content);
    void previousMenu( int state);
    String search(String name);
    String delete(String name);

}
