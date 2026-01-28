public class Agreegation {
    public static void main(String[] args) {
        University u1 = new University("IILM");
        Professor p = new Professor("Divyanshu sir",u1);
        p.displayProfDetails();
    }
}



class University{
    private String uniName;
    University(String name){
        this.uniName = name;
    }

    public String getUName(){
        return uniName;
    }

}

class Professor{
    private String profName;
    private University uni;

    Professor(String profName, University uni){
        this.profName = profName;
        this.uni = uni;
    }

    public void displayProfDetails(){
        System.out.println(profName);
        System.out.print("Working in : "+ uni.getUName());
        
    }


}
