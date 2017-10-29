package dataStructures.linkedList;

public class LinkedList {
    private Node head;
    public LinkedList(){
        head=null;
    }

    public void insertHead(int x){
        Node node=new Node(x);
        node.next=head;
        head=node;


    }
    public Node search(int x){
        Node current =head;
        while(current!=null){
            if(current.getData()==x){
                return current;
            }
            current=current.next;
        }
        return null;
    }

    public void display(){
        Node current =head;
        while(current!=null){

            System.out.println(current.getData());
            current=current.next;

        }
    }
    public void remove(int x){
        Node current =head;
        while (current.next!=null) {
            if (current.next.getData() == x) {
                Node temp = current.next;
                current.next = temp.next;
                return;
            }else if(head.getData()==x){
                head=current.next;
                return;
            }
            current=current.next;
        }

    }


    public boolean isEmpty(){
        return (head==null);
    }

    public Node deleteHead(){
        Node temp=head;
        head=head.next;
        return temp;
    }


    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(30);
        list.insertHead(40);
        list.insertHead(50);
        System.out.println("deletion done : "+list.deleteHead().getData());
        System.out.println("Search done : "+list.search(40).getData());
        System.out.println("Search done : "+list.search(50));
        list.display();

        System.out.println("---- this for display ----");
        list.display();
        System.out.println("searching "+list.search(10).getData());
        list.remove(30);
        System.out.println("---- this for display ----");
        list.display();
        list.remove(60);
        System.out.println("---- this for display ----");
        list.display();
        list.remove(10);
        System.out.println("---- this for display ----");
        list.display();
        System.out.println("Search done : "+list.search(10));
        System.out.println("Search done : "+list.search(40).getData());
    }



}
