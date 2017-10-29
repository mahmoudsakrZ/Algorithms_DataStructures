package dataStructures.queue;

// Queue Implementation with array
// FIFO
public class Queue<T> {
    T [] arr;
    // it is a pointer for inserting new element in the queue
    int front;
    // it is a pointer for removing an element from the queue
    int rear ;
    /*
        declare an array with initial size 2
        put initial position for rear and front at the end of the array
     */
    public Queue(){
        arr=(T[]) new Object[2];
        rear=front=arr.length;
    }

    // this method for adding new element in the queue
    /*
        in the first case it test if the stack still have more empty positions it will add new element
        if not it will resize the array first then add the new element
     */
    public void enQueue(T element){

        if(rear>0){
            arr[--rear]=element;

        }else {
            arr = resize(arr);
            arr[--rear]=element;
            System.out.println("Queue is resized");
        }

    }
    // this method for removing the first element in the queue
    /*
        at first it test if the queue is empty if the two pointers are in the same position so it will be empty
        if not it will remove the last element that entered first [FIFO]
     */
    public void deQueue(){

        if(rear==front){
            System.out.println("The Queue is empty !!");
            return;
        }
        System.out.println( arr[--front]);
    }
    //this method for returning the size of the queue
     public int size(){
        return front-rear;
     }

    /*
        if the array is full we will resize it to be double of the size because queue is not limit size
        start copy from the front to rear into position that start from the end of the new array
     */
     public T[] resize(T arr[]){

         this.arr=(T[])new Object[arr.length*2];
         int index =this.arr.length;
         for (int i=front-1;i>=rear;i--){
            this.arr[--index]=arr[i];
         }
         front=this.arr.length;
         rear=index;
         return this.arr;

     }


    /*
        main method for run the code
     */
    public static void main(String[] args) {
         Queue<Integer> q=new Queue<Integer>();
         q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(9);
        q.enQueue(10);
        q.enQueue(11);
        q.enQueue(12);
        System.out.println("The size of the queue is : "+q.size());
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();

    }
}
