class Student {
    private int prn;
    private String name;
    
    Student(int prn, String name){
        this.prn = prn;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getPrn(){
        return this.prn;
    }


}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student(121212,"Abheeshek");
        System.out.println(s1.getPrn());


    }
}
