public class Car {
    String model;
    Car(String model){
        this.model = model;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Mercedez");
        Car c2 = c1;

        c2.model = "bmw";
        c2 = null;
        System.out.println(c2 +" "+c1);
    }
}
