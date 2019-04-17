package JavaConcepts.nestedClass.StaticClass;

class TestOuter1{
    static int data=30;

    static class Inner{

        void msg(){System.out.println("data is "+data);}

        public static int sum(int x, int y){
            return x+y;
        }
    }

    public static void main(String args[]){

        TestOuter1.Inner obj=new TestOuter1.Inner();
        obj.msg();

        // static method in static class
        TestOuter1.Inner.sum(55,55);
    }
}