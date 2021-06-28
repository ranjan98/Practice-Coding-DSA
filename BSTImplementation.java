import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST{
    Node root;
    // Create a Linked List
    public BST(){
        // Create a New Node
        this.root = null;
    }
    // Insert into BST
    public void insert(int data){
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        }
        else{
            Node currentNode = this.root;
            while(true){
                if(data < currentNode.data){
                    // For the left side
                    if(currentNode.left == null){
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                }
                else{
                    // for the Right side
                    if(currentNode.right ==  null){
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }
    // Look up in BST
    public Node lookup(int data){
        if(this.root == null){
            return null;
        }
        Node currentNode = this.root;
        if(data < currentNode.data){
            currentNode = currentNode.left;
        }
        else if(data > currentNode.data){
            currentNode = currentNode.right;
        }
        else if(currentNode.data == data){
            return currentNode;
        }
        return null;
    }
}
public class BSTImplementation{
    
    public static void main(String []args){
       BST t = new BST();
       t.insert(9);
       t.insert(4);
       t.insert(6);
       t.insert(20);
       t.insert(170);
       t.insert(15);
       t.insert(1);
       t.lookup(1);
               
        //     9
        //  4     20
        //1  6  15  170
        
    }
    
}
