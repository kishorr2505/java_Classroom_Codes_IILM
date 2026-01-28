class Dept {
    String name;
    Dept(String name){
        this.name = name;
    }    

    public String getDeptName(){
        return name;
    }
}

class Student {
    String name;
    Dept dept;
    Student(String name, Dept dept){
        this.name = name;
        this.dept = dept;
    }

    void displayDitails(){
        System.out.println("Student Details as : \n Name: "+ this.name+ "\tDepartment:"+ dept.getDeptName());
    }
}

class Main{
    public static void main(String[] args){
        Dept cs = new Dept("Computer Science");
        Student s = new Student("Abhi",cs);
        s.displayDitails();
    }
}