class Car {
    private String cName;
    private Engine engine;
    Car(String cName, String eName ){
        this.cName = cName;
        this.engine = new Engine(eName);
    }    

    void startCar(){
        System.out.println("Car is started with engine details are : " );
        engine.ingineDetails();
    }
}

class Engine{
    private String eName;
    Engine(String eName){
        this.eName = eName;
        // this.eType = eType;
    }

    public void ingineDetails(){
        System.out.println(eName);
    }
}

class Main{
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "V8");
        bmw.startCar();

    }
}
