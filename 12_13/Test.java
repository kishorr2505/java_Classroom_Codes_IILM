abstract class Test{
    public abstract void m1();
    public abstract void m2();
}
abstract class T1 extends Test{
    public void m1(){}
    // public void m2(){}    
}
class T2 extends T1{
    public void m2(){}
}