abstract class RBI{
     int loginPin;    
    RBI(int pin){
        this.loginPin = pin;
        // System.out.println("RBI constructor");
    }
    abstract void atm();
    abstract void login(int pin);
}
class SBI extends RBI{
    SBI(int pin){
        super(pin);
    }
    void atm(){
        System.out.println("SBI takes 0.1% charges on every transaction");
    }

    public void login(int pin){
        if(this.loginPin == pin){
            System.out.println("SBI customer Login successful...");
        }else{
            System.out.println("Invalid Credentials");
        }
        
    }
}
class Main{
    public static void main(String[] args){
        // RBI c1 = new RBI();;
        SBI u1 = new SBI(1234);
        u1.login(1233);

    }
}



// class Hdfc extends RBI{
//     void atm(){
//         System.out.println("HDFC takes 0.5 % charges on every trasaction");
//     }
//     void login(){
//         System.out.println("HDFC customer login successful..");
//     }
// }

