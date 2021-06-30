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
    // DFS Implementation - In order
    public ArrayList dfsInorder(){
        return dfsInorderTraversal(this.root, new ArrayList<Integer>());
    }
    // DFS Implementation - Pre order
    public ArrayList dfsPreorder(){
        return dfsPreorderTraversal(this.root, new ArrayList<Integer>());
    }
    // DFS Implementation - Post order
    public ArrayList dfsPostorder(){
        return dfsPostorderTraversal(this.root, new ArrayList<Integer>());
    }
    // In order Traversal
    public ArrayList dfsInorderTraversal(Node node, ArrayList<Integer> list){
        if(node.left!=null)
            dfsInorderTraversal(node.left, list);
        list.add(node.data);
        if(node.right!=null)
            dfsInorderTraversal(node.right, list);
        return list;
    }
    // Pre order traversal
    public ArrayList dfsPreorderTraversal(Node node, ArrayList<Integer> list){
        list.add(node.data);
        if(node.left!=null)
            dfsPreorderTraversal(node.left, list);
        if(node.right!=null)
            dfsPreorderTraversal(node.right, list);
        return list;
    }
    // Post order traversal
    public ArrayList dfsPostorderTraversal(Node node, ArrayList<Integer> list){
        if(node.left!=null)
            dfsPostorderTraversal(node.left, list);
        if(node.right!=null)
            dfsPostorderTraversal(node.right, list);
        list.add(node.data);
        return list;
    }
}
public class DFSImplementation{
    
    public static void main(String []args){
       BST t = new BST();
       t.insert(9);
       t.insert(4);
       t.insert(6);
       t.insert(20);
       t.insert(170);
       t.insert(15);
       t.insert(1);
       System.out.println(t.dfsInorder()); // [1, 4, 6, 9, 15, 20, 170]
       System.out.println(t.dfsPreorder()); // [9, 4, 1, 6, 20, 15, 170]
       System.out.println(t.dfsPostorder()); // [1, 6, 4, 15, 170, 20, 9]
               
        //     9
        //  4     20
        //1  6  15  170
        
    }
    
}
