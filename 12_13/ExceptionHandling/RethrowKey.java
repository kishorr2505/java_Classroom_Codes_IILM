import java.util.*;
class throwsKeyword {
    public static void area()throws Exception{
       
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Area of Square is:" + length*length);
      

        
    }
    public static void main(String[] args) {
        try{
            area();
        }catch(Exception e){
            // 
            System.out.println("InputMismatchedException");
            throw e; // rethrow exception 
        }
    }
}