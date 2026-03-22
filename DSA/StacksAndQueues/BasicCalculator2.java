// Question 227
// https://leetcode.com/problems/basic-calculator-ii/
class Solution {
    public int calculate(String str) {
        Stack<Integer>s = new Stack<>();
        char operator = '+';
        int num = 0;
        for(int i =0;i<str.length();i++){
           char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch -'0');
            }

            if((!Character.isDigit(ch) && ch != ' ' )|| i== str.length()-1){
                if(operator=='+'){
                    s.push(num);
                }else if(operator =='-'){
                    s.push(-num);
                }else if(operator =='*'){
                    s.push(s.pop()*num);
                }else if(operator =='/'){
                    s.push(s.pop()/num);
                }
                operator = ch;
                num = 0;
            }
            
        }
        int result = 0;
        while(!s.isEmpty()){
            result += s.pop();
        }
        
        return result;
    }
}