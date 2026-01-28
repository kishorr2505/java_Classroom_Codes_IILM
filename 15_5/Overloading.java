 class Overloading {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1(10,10);
    }
}

class Test{
    public void m1(int a,float b){
        System.out.println("int float");
    }

    public void m1(float a, int b){
        System.out.println("float int");

    }

    
}
