//https://leetcode.com/problems/asteroid-collision/description/
// Question 735

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int[]result = new int[n];
        int top = -1;
        for(int num:asteroids){
            if(num>=0){
                result[++top] = num;
            }else{
                while(top !=-1 && result[top]>=0 && Math.abs(result[top])<Math.abs(num)){
                top--;
                }
                if(top==-1 || result[top]<0) result[++top] = num;
                else if( Math.abs(result[top])==Math.abs(num)){
                    top--;
                }
            }
            
            
        }
        return Arrays.copyOfRange(result,0,top+1);
    }
}