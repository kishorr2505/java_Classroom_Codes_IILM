class Parent1 {
    int data ;
    Parent1(int data){
        this.data = data;
    }
    public void m1(){

        System.out.println("This is m1 method of Parent");
    }    
}



class child extends Parent1{
    child(int data){
        super(10);
        this.data = data;
    }
    // Parent1(100);
    void print(){
        System.out.println(this.data);
    }
    public static void main(String[] args) {
      child c = new child(5);
      c.print();
    }
}


