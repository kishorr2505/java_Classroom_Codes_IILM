// class Test{
//     public static void main(String [] args){
//         m1();

//     }

//     public static void m1(){
//         m2();
//     }

// // Exception Object 
// // Name , Description and Stack trace
// // Default Exception Handler => Print the exception to console

//     // m2
//     // m1
//     // main()
//     public static void m2(){
//         // System.out.println("Hello ");
//         System.out.println(100/0);
//     }
// }


class Excep {
     public static void main(String[] args) {
        System.out.println("Hello 1");
        System.out.println("Hello 2");// Exception
        // System.out.println(100/0);
        System.out.println("Hello 3");
        try{
            System.out.println("Hello");
           
        }catch(Exception e){
            System.out.println("Hello 4");

        }
        System.out.println("Hello 5");
        System.out.println(100/0);
        
        

     }
}