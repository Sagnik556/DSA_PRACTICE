import java.util.LinkedList;
public class LL1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    Node temp=head;
    
    
    public static void removeNfromM(LL1 ll ,int m ,int n){
        
        for(int i=0;i<m;i++){
            temp=head.next;
        }
        for(int i=m;i<m+n;i++){
            ll.removeFirst(i);
            temp.next=head;
        }
        ll.print();
    }

    public void print(){
        while(head.next!=null && head!=null){
            System.out.print(temp.data + "->");
        }
        System.out.println();
    }
    public static void main(String args[]){
        LL1 <Integer> ll = new LL1();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.removeNfromM(2, 2);
        

        // System.out.println(ll.print());
    }
    
}
