package dataStructures.tree;

public class BinaryTree {
    Node root;
    Node current;
    public BinaryTree() {
        root=null;
    }
    /*
        this method for inserting nodes in the binary tree
     */
    public void insert(int x){
        // create new node with data x
        Node node=new Node(x);
        /*
            check if the tree is empty or not
            if empty it will set the root with the inserted node
         */
        if(root==null){
            root=node;
            current=root;
            return;
        }
        /*
            check if the new node will placed in the left side
            if it less than the current node
         */
        if(x<=root.getData()){
            if(root.left==null){
                root.left=node;
                root=current;
            }else {
                root=root.left;
                insert(x);
            }
         /*
            check if the new node will placed in the right side
            if it larger than the current node
         */
        }else {
            if(root.right==null){
                root.right=node;
                root=current;
            }else {
                root=root.right;
                insert(x);
            }
        }
    }
    /*
        this method for searching through the tree
        if a node is existing or not in the tree
        and return true if exist and false if not
     */
    public boolean contain(int data){
        Node current=root;
        while (current!=null) {
            if(data==current.getData())
                return true;
            else if (data <= current.getData()) {
                current = current.left;
            }else {
                current=current.right;
            }
        }
        return false;
    }
    /*
        this method for displaying the nodes of the tree in PostOrder traverse
        (left, right, root)
     */
    public void displayPostOrder(Node node){
       if(node==null){
           return;
       }

        displayPostOrder(node.left);
        displayPostOrder(node.right);
        System.out.print(node.getData()+" ");
    }
    /*
       this method for displaying the nodes of the tree in InOrder traverse
       (left, root, right)
    */
    public void displayInOrder(Node node){
        if(node==null){
            return;
        }

        displayInOrder(node.left);
        System.out.print(node.getData()+" ");
        displayInOrder(node.right);

    }
    /*
       this method for displaying the nodes of the tree in PreOrder traverse
       (root, left, right)
    */
    public void displayPreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.getData()+" ");
        displayPreOrder(node.left);
        displayPreOrder(node.right);

    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(7);
        tree.insert(9);
        tree.insert(12);
        tree.insert(15);
        tree.insert(16);
        tree.insert(3);
        tree.insert(8);
        System.out.println("------------- PostOrder ---------------");
        tree.displayPostOrder(tree.root);
        System.out.println();
        System.out.println("------------- InOrder ---------------");
        tree.displayInOrder(tree.root);
        System.out.println();
        System.out.println("------------- PreOrder ---------------");
        tree.displayPreOrder(tree.root);
        System.out.println();
        System.out.println(tree.contain(5));
    }
}
