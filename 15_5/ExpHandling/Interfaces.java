interface TV{
    public abstract void power();
     void volumeInc();
    public void volDec();
    public void changeChannel();
}

class SamsungRemote implements TV{
   public static boolean isOn = false;
   public static int volume = 10;
    public void power(){
        if(isOn){
            isOn = false;
            System.out.println("TV is turning off...");
        }else{
            isOn = true;
            System.out.println("Turning on the TV..");
        }
    }

    public void volumeInc(){
        volume++;
        System.out.println("Volume: "+ volume);
    }
    public void volDec(){
        volume--;
        System.out.println("Volume: "+ volume);
    }
    public void changeChannel(){
        System.out.println("Chenging the channel...");
    }
}

class Main{
    public static void main(String[] args) {
        TV t1 = new SamsungRemote();
        t1.power();   
        t1.volumeInc();
        t1.volumeInc();
        t1.volDec();
        t1.changeChannel();
        t1.power();
    }
}