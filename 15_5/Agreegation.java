 class Agreegation {
    public static void main(String[] args) {
        // University u = new University("IILM");
        Professor p = new Professor("Sadik", null);
        p.printDetails();

    }    
}

class University{
    private String name;
    University(String name){
        this.name = name;
    }

    public String getUniName(){
        return this.name;
    }
}

class Professor{
    private String name;
   private  University university;

    Professor(String name, University uni){
        this.name = name;
        this.university = uni;
    }

    public void printDetails(){
        System.out.println("Professor name is :"+ this.name);
        // System.out.println("Professor is working in : "+ university.getUniName()+"University ");
    }
}
