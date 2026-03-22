public class FindCelibrity
{   public static boolean knows(int i,int j){
        boolean [][] matrix  = new boolean[2][2];
        
        // matrix[0][2] = true;
        matrix[1][0] = true;
        // matrix[1][2] = true;
        // matrix[3][1] = true;
        
        return matrix[i][j];
        
    }
    
    public static int celibrity(int n){
       Stack<Integer>s = new Stack<>();
       
       for(int i=0;i<n;i++){
           s.push(i);
       }
      int a,b;
       while(s.size()>1){
           a = s.pop();
           b = s.pop();
           
           if(knows(a,b)) s.push(b);
           else s.push(a);
       }
       
       int c = s.peek();

    // verify that c is acutally celibrity
    
    for(int i = 0; i < n; i++){
        if(i != c && (knows(c,i) || !knows(i,c))){
            return -1;
        }
    }
       return c;
    }
	public static void main(String[] args) {
		System.out.println(celibrity(2));
        
	}
}