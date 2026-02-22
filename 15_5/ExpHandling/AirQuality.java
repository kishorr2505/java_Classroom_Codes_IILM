//  class AQIOutOfBoundException extends Exception{
//         AQIOutOfBoundException(int aqi){
//             super("Air quality is not predictable ");
//         }
//  }

//  class AirQuality {
//     public static void displayAirQuality(int aqi){
//         if(aqi <= 100){
//             System.out.println("Good Air Quality, Green Signal");
//         }else if(aqi <=250){
//             System.out.println("Yellow alert, wear mask");
//         }else if(aqi <=999){
//             System.out.println("Red Alert");
//         }else{
//             try{
//                 throw new AQIOutOfBoundException(aqi);
//             }catch(AQIOutOfBoundException e){
//                 e.printStackTrace();
//             }
//         }
//     }    

//     public static void main(String[] args) {
//         displayAirQuality(1050);
//     }
// }


//  class AQIOutOfBoundException extends Exception{
//         AQIOutOfBoundException(int aqi){
//             super("Air quality is not predictable ");
//         }
//  }

//  class AirQuality {
//     public static void displayAirQuality(int aqi)throws AQIOutOfBoundException{
//         if(aqi <= 100){
//             System.out.println("Good Air Quality, Green Signal");
//         }else if(aqi <=250){
//             System.out.println("Yellow alert, wear mask");
//         }else if(aqi <=999){
//             System.out.println("Red Alert");
//         }else{
//             throw new AQIOutOfBoundException(aqi);
//         }
//     }    

//     public static void main(String[] args) {
       
//          try{
//                 displayAirQuality(1050);
//             }catch(AQIOutOfBoundException e){
//                 //  e.printStackTrace();// Excp Name + DEscription + stacke Trace 

//                 // System.out.println(e.toString()); // Name + Description 

//                System.out.println( e.getMessage()); // Description 
//             }
//     }
// }



class AQIOutOfBoundException extends Exception{
        AQIOutOfBoundException(int aqi){
            super("Air quality is not predictable ");
        }
 }

 class AirQuality {
    public static void displayAirQuality(int aqi)throws AQIOutOfBoundException{
        if(aqi <= 100){
            System.out.println("Good Air Quality, Green Signal");
        }else if(aqi <=250){
            System.out.println("Yellow alert, wear mask");
        }else if(aqi <=999){
            System.out.println("Red Alert");
        }else{
            throw new AQIOutOfBoundException(aqi);
        }
    }    

    public static void main(String[] args) throws AQIOutOfBoundException {
       
                displayAirQuality(1050);
           
    }
}
