public class StudentMarks {
    int score;

    StudentMarks(int score){
        this.score = score;
    }

    public void boostScore(StudentMarks s, int bonus){
        s.score += bonus;
    }

    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks(80);
        System.out.println(s1.score);

        s1.boostScore(s1, 10);
        System.out.println("Marks after adding bonus: "+s1.score);

    }
}
