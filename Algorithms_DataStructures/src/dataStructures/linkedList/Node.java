package dataStructures.linkedList;
/*
    this class represent each node in the LinkedList which
    consist of data and a pointer for the next node
 */
public class Node {
    private int data;
    public Node next;

    public Node(int inData){
        data=inData;
    }

    public int getData(){
        return data;
    }
}
