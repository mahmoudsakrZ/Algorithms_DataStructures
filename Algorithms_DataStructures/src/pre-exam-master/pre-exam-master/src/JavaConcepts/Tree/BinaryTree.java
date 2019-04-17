package JavaConcepts.Tree;

class Node{
    int v;
    Node l , r;
    Node(int v){
        this.v = v;
    }
}

public class BinaryTree {

    private Node root;

    void insert(int v){

        Node n = new Node(v);

        if(root == null){

            root = n;

        } else{

            Node i = root;

            while(true){

                Node p = i;

                if(v < p.v){
                    i = p.l;
                    if(i==null){
                        p.l = n;
                        return ;
                    }
                }
                else{
                    i=p.r;
                    if(i==null){
                        p.r = n;
                        return;
                    }
                }
            }
        }
    }

    boolean search(int v){
        Node i = root;
        while(i!=null){
            if(i.v == v){
                return true;
            }
            else if (i.v > v){
                i = i.l;
            }
            else{
                i = i.r;
            }
        }
        return false;

    }

    private void print(Node n){
        if(n==null)return;
        System.out.print(n.v + " ");
        print(n.l);
        print(n.r);
    }

    void print(){
        print(root);
        System.out.println("");
    }

    int height(){
        if(root == null)return 0;
        else{
            return height(0 , root);
        }
    }

    private int height(int h , Node n){
        if(n == null)return h;
        h++;
        return Math.max(height(h , n.l), height(h, n.r));

    }

}

