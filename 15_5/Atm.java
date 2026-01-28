class Atm {
    private int balance;
    private int pin;
    Atm(int balance, int pin){
        this.balance = balance;
        this.pin = pin;
    }

    public int getBalance(int pin){
        if(this.pin!=pin){
            System.out.println("Invalid Credentials");
            return -1;
        }
        return this.balance;
    }

    public void setBalance(int credit){
        this.balance += credit;
    }

    public void setPin(int oldPin, int newPin){
        if(this.pin==oldPin){
            this.pin=newPin;
            System.out.println("Pin successfully updated");
            return;
        }else{
            System.out.println("Invalid credentials");
        }

    }


}

class Main{
    public static void main(String[] args) {
        Atm u1 = new Atm(2000, 1234);
        System.out.println(u1.getBalance(1234));
        u1.setBalance(5000);
        System.out.println("Amout after credit:"+u1.getBalance(1234));
        u1.setPin(1234, 4321);
        
    }
}

