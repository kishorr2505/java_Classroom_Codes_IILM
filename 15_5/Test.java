abstract class Test{
    private int data;
    Test(int data){
        this.data = data;
        System.out.println(this.data);
    }
    Test(){
        System.out.println("Parameterless constructor of Parent");
    }
    public abstract void m1();
    public abstract void m2();
}
class T1 extends Test{
    T1(int data){
        // super(data);
        super();
    }
   public void m1(){
    System.out.println();
   }
   
   public void m2(){
    System.out.println();
   }

   public static void main(String[] args){
    T1 t = new T1(10);
   } 

}