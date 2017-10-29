package dataStructures;
/*
    this class for implementing LinkedList DS
 */

public class LinkedList {

    Node head;
    /*
        that is a constructor for setting default head value
     */
    public LinkedList(){
        head=null;
    }
    /*
        in this method it add new node for the linked list
        at the start of the LinkedList (from the head)
        O(1)
     */
    public void insertHead(int x){
        Node node=new Node(x);
        node.next=head;
        head=node;

    }
    /*
        this method for searching through the LinkedList
        it start from the head to the end of the LinkedList
        O(n)
     */

    public Node search(int x){
        Node current=head;
        while (current!= null){
            if(current.getData()==x){
                return current;
            }
            current=current.next;
        }
        return null;
    }

    /*
        this method for removing a node from the LinkedList
        it search for it at first then delete it by make the prev node
        refer to the next of that node
        O(n)
     */
    public void remove(int x){
        Node current =head;
        while (current.next!=null) {
            if (current.next.getData() == x) {

                current.next = current.next.next;
                return;
            }else if(head.getData()==x){
                head=current.next;
                return;
            }
            current=current.next;
        }

    }
    /*
        this method for adding new node in the LinkedList at the end of it
        it start from the beginning of the LinkedList till the end of it then
        add the node
        O(n)
     */

    public void append(int x){
        if(head==null){
            head=new Node(x);
            return;
        }
        Node current =head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=new Node (x);
    }
    /*
        this method for display all data in each node in the LinkedList
        it start from the head to the end of the LinkedList
        O(n)
     */
    public void display(){
        Node current =head;
        while(current!=null){

            System.out.println(current.getData());
            current=current.next;

        }
    }
    /*
        it is a main method for running the code and try all methods
     */
    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insertHead(1);
        list.insertHead(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.insertHead(6);
        System.out.println("---- this for display ----");
        list.display();
        System.out.println("searching "+list.search(4).getData());
        list.remove(3);
        System.out.println("---- this for display ----");
        list.display();
        list.remove(6);
        System.out.println("---- this for display ----");
        list.display();
        list.remove(4);
        System.out.println("---- this for display ----");
        list.display();
    }
}
