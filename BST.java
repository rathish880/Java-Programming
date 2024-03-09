class BST{
    class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }

    }
    private Node root;

    public BST() { }

    public int height(Node node){
        if(node == null)
          return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }


    public void insert (int value){
        root=insert(value,root);    

    }

    private Node insert(int value,Node node){ 
        if(node == null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value, node.left);
        }
        if(value>node.value){
            node.right=insert(value, node.right);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;

        return node;

    }

    private void populate(int nums[]){

        for(int i=0;i<nums.length;i++){

            this.insert(nums[i]);

        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(mid);

        populateSorted(nums, start, mid);
        populateSorted(nums,mid+1, end);


    }


    public Boolean balanced(){
        return balanced(root);
    }
    private Boolean balanced(Node node){
        if(node==null)
          return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left)&& balanced(node.right) ;

    }

    public void display(){
         display(root,"root node :");
    }
    private void display(Node node, String details){

        if (node==null){
            return;
        }

        System.out.println(details + node.value);
        display(node.left,"Left  node of" + node.value + ":");
        display(node.right,"right node of "+node.value + ":");

    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }

        System.out.println(node.value +" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        preorder(root);
    }
    private void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.value +" ");
        inorder(node.right);
    }

    public void postorder(){
        preorder(root);
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }        
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value +" ");
    }

    




    public static void main(String args[]){

        BST bt=new BST();
        bt.insert(4);
        int nums[]={1,2,4,5,3,8,9};
        bt.populate(nums);
        bt.display();


    }
   
}