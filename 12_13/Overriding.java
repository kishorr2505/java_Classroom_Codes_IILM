public class Overriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1(10);

        Child c = new Child();
        c.m1(10);

        Parent p1 = new Child();
        p1.m1(10);

        
    }
}

class Parent{
    public  Number m1(int ...i){
        System.out.println("m1 of Parent");
        return 0;
    }
}

class Child extends Parent{

       public  Integer m1(int ...i){
        System.out.println("Child m1 method");
        return 0;
       }
}

// class child2 extends Child{
//     public Integer m1(){
//         System.out.println("child2 m1");
//         return 0;
//     }
// }
