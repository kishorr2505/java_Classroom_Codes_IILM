 class Constructors {
    int rollno;
    String name;

     private Constructors(){
        // 
        System.out.println("IILM");
    }

    
}

public class Student2{
public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors();

        // System.out.println(c1.rollno +":" + c1.name);
        // System.out.println(c2.rollno +":" + c2.name);

    }
}
