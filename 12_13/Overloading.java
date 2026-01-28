class Overloading{
    public static void main(String[] args) {
        Test t = new Test();
        
        Fruit f = new Fruit();
        // t.m1(f);

        Apple a = new Apple();
        // t.m1(a);

        Fruit f1 = new Apple();
        t.m1(f1);

    }
}

class Test{
    public void m1(Fruit f){
        System.out.println("Fruit ");
    }

    public void m1(Apple a){
        System.out.println("Apple");
    }

    
}

class Fruit{

}
class Apple extends Fruit{

}