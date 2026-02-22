interface I1{
    public void m1();
}

interface I2{
    public void m1();
}

class MultipleInheritance implements I1,I2{
    @Override
    public void m1(){
        System.out.println("This is m1 implementation..");
    }
}

class Main{
    public static void main(String[] args) {
        I1 a = new MultipleInheritance();

        I2 b = new MultipleInheritance();
        a.m1();

        b.m1();
    }
}
