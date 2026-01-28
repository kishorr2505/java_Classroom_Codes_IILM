 abstract class Vehical {
    public abstract void start();
}
class Car extends Vehical{
    public void start(){
        System.out.println("Car starts with Key");
    }
}

class Bike extends Vehical{
    public void start(){
        System.out.println("Bike starts wtih kick");
    }

    public static void main(String [] args){
        Bike b1 = new Bike();
        b1.start();
        Car c = new Car();
        c.start();
    }
}