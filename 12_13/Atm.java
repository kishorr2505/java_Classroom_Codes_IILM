class Atm {
    private int balance;
    private int pin;
    
    Atm(int balance, int pin){
        this.balance = balance;
        this.pin = pin;
    }

   public int getBalance(){
        return balance;
    }
    public void setBalance(int credit){
        balance = balance + credit;
    }

    public void setPin(int oldPin, int newPin){
        if(this.pin == oldPin){
            this.pin = newPin;
            System.out.println("PIn updated successfully");
        }else{
            System.out.println("invalid credentials");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Atm a1 = new Atm(2000,1234);
        // System.out.println("initial Amount:"+a1.getBalance()); 
        // a1.setBalance(5000);

        // System.out.println("Amount after addinng balance:"+a1.getBalance()); 

        a1.setPin(1234, 2222);
        // System.out.println();


    }
}
