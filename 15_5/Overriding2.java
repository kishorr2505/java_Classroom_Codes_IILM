class Overriding2 {
    public static void main(String[] args) {
        // Parent p = new Parent();
        // p.m1(10);

        // child c = new child();
        // c.m1(10);

        Parent p1 = new child();
        p1.m1(10);

        // child2 c2 = new child2();
        // c2.m1();

    }
}

class Parent{
    public  Number m1(int ...i){
        System.out.println("m1 of Parent");
        return 0;
    }
}
class child extends Parent{
    public Integer m1(int...i)
    {
        System.out.println("m1 of Child");
        return 0;
    }
}

// class child2 extends child{
//     public void m1(){
//         System.out.println("m1 of child2");
//     }
// }