// package ExpHandling;

class finallyBlock {
    public static void main(String[] args) {
            try{
                System.out.println("Statement 1");
                System.out.println(100/0);
                System.out.println("Statement 2");
            }catch(NullPointerException e ){
                System.out.println("Statement 3");
            }finally{
                System.out.println("Statement 4");
            }
            System.out.println("Statement 5");
    }    
}
