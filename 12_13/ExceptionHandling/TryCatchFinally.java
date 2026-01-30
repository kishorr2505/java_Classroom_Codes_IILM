
// public class TryCatchFinally {
//     public static void main(String[] args) {
//             try{
//                 System.out.println("Database connection Established");
//                 //  throw new Exception("exception");
//                 System.out.println("Data Read");
               
//             }catch(Exception e){
//                 System.out.println("Exception Occured");
//             }finally{
//                 System.out.println("Database Connection closed");
//             }
            
//     }
// }

class TryCatchFinally{
    public static void main(String[] args) {
        try{
            System.out.println("Try");
            System.out.println(100/0);
        }catch(Exception e){
            System.out.println("catch");
        }finally{
            System.out.println("Finally");
        }
    }
}
