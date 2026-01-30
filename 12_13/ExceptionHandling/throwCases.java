
// public class throwCases {
//     public static void main(String[] args) {
//         throw new NullPointerException();
//         System.out.println("Hello ");
//     }
// }


// case1:

// public class throwCases {
//     static ArithmeticException e = new ArithmeticException();
//     public static void main(String[] args) {
//         throw e;
//     }
// }


public class throwCases {
    static ArithmeticException e;
    public static void main(String[] args) {
        e.printStackTrace();
        throw e;
    }
}