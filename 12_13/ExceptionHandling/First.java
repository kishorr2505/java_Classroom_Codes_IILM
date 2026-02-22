class First{
    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            System.out.println(100/0);
        }catch(ArithmeticException e){
            // handling code 
            // System.out.println("ArithmeticException");
            // e.printStackTrace(); // name + Description + Stack Trace
            // System.out.println(e.toString()); // name + Description 
            System.out.println(e.getMessage()); // Description
        }
    }
}

// class First{
//     public static void main(String[] args) {
//         System.out.println("Hello world");
//         try{
//             System.out.println(100/0);
//         }catch(NullPointerException e){
//             // handling code 
//             // System.out.println("ArithmeticException");
//         }
//     }
// }