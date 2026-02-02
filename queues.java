public class queues {


    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
 
         class Queue{
            static Node head= null; 
            static Node tail = null;
        

       
        // empty
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        // // full
        // public static boolean isFull(){
        //     return (rear+1)%size == front;
        // }

        // add
        public static void add(int data){

            Node newNode  = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }


        //     if(isEmpty()){
        //         System.out.println("Empty queue");
        //         return -1;
        //     }


        //     int front = head.data;
        //     //  single element
        //     if(tail == head){
        //         tail = head= null;
        //     } else{
        //         head = head.next;
        //     }
        //     return front;
        // }

             

            // if(rear == size-1){
            //     System.out.println("Queue Overflow");
            //     return;
            // }
            // // add 1st element
            // if(front==-1){
            //     front = 0;
            // }

            // rear+=1;
            // arr[rear]=data;
        }


        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }

            int front = head.data;

            // single element
            if(tail==head){
                tail = head = null;

            }else{
                head = head.next;
            }

            return front;

            // int result=arr[front];
            // front=(front +1)%size;

            // // last el delete 
            // if(rear== front){
            //     rear=front=-1;
            // }else{
            //     front=(front+1)%size;
            // }
            
            

            // return result;

        }


        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
         Queue q = new Queue();
         q.add(1);
         q.add(2);
         q.add(3);

       



        while(!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
        }
       
    }
}

