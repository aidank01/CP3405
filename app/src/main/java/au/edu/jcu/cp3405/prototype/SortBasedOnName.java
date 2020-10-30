package au.edu.jcu.cp3405.prototype;

import java.util.Comparator;

public class SortBasedOnName implements Comparator<Contact> {
    public int compare(Contact c1, Contact c2) {
        return c1.getName().compareToIgnoreCase(c2.getName());//where uname is field name
    }
}
