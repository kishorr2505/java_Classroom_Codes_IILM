public class Overriding{
    public static void main(String[] args) {
        Test t = new Test();
        // t.m1();

        Child c = new Child();
        // c.m1();

        Test p1 = new Child();
        p1.m1();


    }
}

class Test{
     public Object m1(){
        System.out.println("m1 method of Test calss");
        return null;
    }

}
class Child extends Test{
    public  String m1(){
        System.out.println("m1 method of child class");
        return null;
    }

}