package chapter15;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<String>();
        
        staff.addLast("Keith");
        staff.addLast("Brendan");
        staff.addLast("Tom");
        staff.addLast("Alex");
        
        ListIterator iterator = staff.listIterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
        Collection<String> list = new LinkedList<String>();
        list.add("Keith2");
        list.add("Brendan2");
        list.add("Tom2");
        list.add("Alex2");
        Iterator<String> iter = list.iterator();
        
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
