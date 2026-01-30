import java.util.Scanner;

// public class throwsKeyword {
//     public static void area(){
//        try{
//         Scanner sc = new Scanner(System.in);
//         int length = sc.nextInt();
//         System.out.println("Area of Square is:" + length*length);
//        }catch(Exception e){
//             System.out.println("Input mismatched");
//        }

        
//     }
//     public static void main(String[] args) {
//         area();
//     }
// }



public class throwsKeyword {
    public static void area()throws Exception{
       
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Area of Square is:" + length*length);
      

        
    }
    public static void main(String[] args) {
        try{
            area();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


// public class throwsKeyword {
//     public static void area()throws Exception{
       
//         Scanner sc = new Scanner(System.in);
//         int length = sc.nextInt();
//         System.out.println("Area of Square is:" + length*length);
      

        
//     }
//     public static void main(String[] args)throws Exception{
//         area();
//     }
// }