public class Testt {
    

    public static void main(String[] args) {
        Student st = new Student(50);
        attemptReassign(st);
        System.out.println(st.score); //What will this print?
    }
}

class Student{
   int score;
   Student(int score){
      this.score = score;
   }
}
