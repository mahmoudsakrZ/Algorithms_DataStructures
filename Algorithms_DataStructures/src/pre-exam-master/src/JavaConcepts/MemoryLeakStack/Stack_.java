package JavaConcepts.MemoryLeakStack;

class Stack_{

    private Object elements [];
    private int size = 0;

    public Stack_(int cap) {
        elements = new Object[cap];
    }

    public void push(Object o){
        if(size+1 < elements.length){
            elements[size++] = o;
        }
        else{
            Object temp [] = new Object[(size+1)*2];  // size+1 = elements.length
            //System.arraycopy(elements, 0, temp, 0, size);
            for(int i=0;i<size;i++){
                temp [i] = elements[i];
                elements[i] = null;
            }
            temp[size++] = o;
            elements = temp;
        }
    }

    public Object pop(){
        if(size == 0){
            throw new StackOverflowError();
        }
        Object res = elements [size-1];
        elements [size-1] = null;
        size--;
        return res;

    }

}

