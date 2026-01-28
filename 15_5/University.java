  class University {
    private String uName;
    University(String name){
        this.uName = name;
    }    

    public String getUniName(){
        return uName;
    }



}

class Prof{
    private String profName;
    private int salary;
    private University university;

    Prof(String profName, int salary, University university){
        this.profName = profName;
        this.salary = salary;
        this.university = university;
    }


}