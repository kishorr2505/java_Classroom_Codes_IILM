class Base {
    Base() { preProcess(); }
    void preProcess() {}
}

class Derived extends Base {
    String data;
    Derived() { data = "Hello"; }
    
    @Override
    void preProcess() {
        System.out.println(data.toLowerCase()); 
    }
}

class Main{
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}


