public class composition {
   public static void main(String[] args) {
        // Car bmw = new Car("BMW", "V12");
        bmw.getcarDetails();
   } 
}

class Car{
    private String name;
    private Engine engine;
    Car(String name, String model){
        this.name = name;
        engine = new Engine(model);
    }

    public void getcarDetails(){
        System.out.println("Car Name:"+ this.name);
        System.out.println("Engine Details are : "+ engine.getModel());

    }
}


class Engine{
    private String model;
    Engine(String model){
        this.model = model;
    }
    
    public String getModel(){
        return model;
    }
    
}
