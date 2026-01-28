
class Test{
    public static void main(String[] args) {
    System.out.println("Hello");
    System.out.println("Heljo");
        try{
            System.out.println(100/0);
        }catch(Exception e ){
            e.printStackTrace();
        }

        System.out.println("IILM");
    }
} 

// {
//     stm1;
//     stmt2;
//     stmt3;
//     try{
//         stmt4;
//     }catch(Exception e){
//         stmt5;
//     }

//     stmt6;

// }

// case 1 : if exception at stmt 4 and corresponding catch block matches (1,2,3,5,6 =>Normal Termination )
// case 2 : If exception stmt 4 but catch block does not match (1,2,3,=> abnormal termination)

// case 3 : If exception at stmt 3 (1,2 => abnormal termination)
// case 4:  exception at stmt 6 (1,2,3,4 => abnormal)