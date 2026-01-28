public class Student {
    int rollno;
    String name;
    static int count;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
        count++;
    }

    void percentage(){
        int marks;
        // System.out.println(rollno+" "+name);
        // System.out.println(marks);

    }

    public static void main(String[] args) {
        Student s1 = new Student(10,"Abhi");
        Student s2 = new Student(20, "Sham");
        Student s3 = new Student(30, "Ram");
        
        System.out.println(s1.count);
    }
}
