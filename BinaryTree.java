import java.util.*;
public class BinaryTree {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    Node root;
    int size;
    public BinaryTree(){
        this.size=0;
    }
    public void populate(Scanner scanner){
        System.out.println("Enter the root node value: ");

        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);

    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to insert left node for "+ node.value);
        Boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left node of "+ node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to insert right node for "+ node.value);
        Boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right node of "+ node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
        
    }
    public void display(){
        display(root,"");
    }
    public void display(Node node,String indent){
        if(node==null)
            return;
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        Scanner sc=new Scanner(System.in);
        bt.populate(sc);
        bt.display();
    }
    
}
