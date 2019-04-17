package JavaConcepts.Enum;

public class Test2 {

    public static void main(String[] args) {

        System.out.println(Users.valueOf("Admin").getName());

        for (Users u : Users.values()){
            System.out.println(u + u.getName() + u.getCode());
        }

    }

    enum Users{

        Admin(4 , "ahmed") , SuperVisor(4 , "ahmed") ,  NormalUser(4 , "ahmed");

        private int code;
        private String name;

        Users(int code , String name){
            this.code = code;
            this.name = name;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }



}
