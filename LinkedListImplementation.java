import java.util.ArrayList;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    // Create a Linked List
    public LinkedList(int data){
        // Create a New Node
        this.head = new Node(data);
    }
    // Printing the Linked List Elements
    public void print(){
        ArrayList<Integer> arr = new ArrayList<>();
        Node t = this.head;
        while(t!=null){
            arr.add(t.data);
            t = t.next;
        }
        System.out.println(arr);
    }
    // Adding Elements to the Linked List
    public void add(int pos, int data){
        Node n = new Node(data);
        Node t = this.head;
        if(pos<=0){
            n.next = t;
            this.head = n;
        }
        else{
            while(pos>1){
                if(t.next==null){
                    t.next = n;
                }
                t = t.next;
                pos--;
            }
            n.next = t.next;
            t.next = n; 
        }
    }
    // Deleting Elements from the Linked List
    public void remove(int pos){
        Node t = this.head;
        if(pos<=0){
            t = t.next;
            this.head = t;
        }
        else if(t.next == null){
            t = null;
            this.head = t;
        }
        else{
            while(pos>1){
                if(t.next.next==null){
                    t.next = null;
                    break;
                }
                else{
                    t = t.next;
                }
                pos--;
            }
            t.next = t.next.next;
        }
    }
    // Reverse the Linked List
    public void reverse(){
        if(this.head.next == null){
            return;
        }
        Node first = this.head;
        Node second = first.next;
        while(second!= null){
            Node temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        this.head.next = null;
        this.head = first;
    }
}
public class LinkedListImplementation{
    
    public static void main(String []args){
       LinkedList l = new LinkedList(10);
       l.add(1, 5);
       l.print(); // [10, 5]
       l.add(0, 2);
       l.print(); // [2, 10, 5]
       l.add(1, 3);
       l.print(); // [2, 3, 10, 5]
       l.add(2, 11);
      l.print(); // [2, 3, 11, 10, 5]
       l.remove(2);
       l.print(); // [2, 3, 10, 5]
       l.reverse();
       l.print(); // [5, 10, 3, 2]
    }
    
}
