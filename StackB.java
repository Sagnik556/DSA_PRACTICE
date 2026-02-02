import java.util.*;
public class StackB{
    // public class Stack{
    //     static ArrayList<Integer> al = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return al.size()==0;
    //     }
    //     // push
    //     public static void push(int data){
    //         al.add(data);
    //     }

    //     // pop
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top=al.get(al.size()-1);
    //         al.remove(al.size()-1);
    //         return top;
    //     } 

    //     // peek
    //     public static int peek(){
    //         if (isEmpty()) {
    //             return -1;
                
    //         }
    //         return al.get(al.size()-1);
    //     }
    // }
    // public static void pushToBottom(Stack<Integer> s , int data){
    //     // base case
    //     if(s.isEmpty()){
    //         s.push(data);
    //         return;
    //     }
    //     int top = s.pop();
    //     pushToBottom(s, data); 
    //     s.push(top);
    // }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while (idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
            
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void pushAtBottom(Stack<Integer> s , int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // kaam
        int top =s.pop();
        // recursion
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
       int top=s.pop();
       reverseStack(s);
       pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static boolean validParenthisis(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length(); i++){
            char ch =str.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                 return false;
                }
            
                if((s.peek()=='('&&ch==')') || (s.peek()=='['&&ch==']') ||(s.peek()=='{'&&ch=='}')){
                 s.pop();
                
                }else{
                 return false;
                }
            } 
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
    Class Node{
        int data;
        Node ptr;
        Node(int d){
            data=d;
            ptr=null;
        }
    }

    Node head;

    public static boolean ispalindrome(Node head){
        Stack<Integer> s = new Stack<>();
        Node slow=head;
        boolean ispalin=true;
        while(slow!=null){
            s.push(slow.data);
            slow=slow.ptr;
        }

        while(head!=null){
            if(head.data==s.pop()){
                ispalin=true;
            }else{
                ispalin=false;
                break;
            }
            head=head.ptr;
        }
        return ispalin;
        
    }

    public static void main(String args[]){
        // Stack<Integer> s= new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // printStack(s);
        // reverseStack(s);
        // printStack(s);
        // String str ="abc";
        // String result= reverseString(str);
        // System.out.println(result);

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // s.push(5);

        // pushToBottom(s,6);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(2);
        Node five = new Node(1);
        one.ptr=two;
        two.ptr=three;
        three.ptr=four;
        four.ptr=five;
        five.ptr=null;
        boolean condition = ispalindrome(one);
        System.out.println(condition);
    }
}