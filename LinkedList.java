import java.util.*;
public class LinkedList {
    class Node{
        int data;
        int next;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        System.out.println(ll.print());
    }
    
}
