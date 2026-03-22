// Question 1047 
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String str) {
        Stack<Character> s = new Stack<>();
        char dup = ' ';
        for(int i=0;i<str.length();i++){
            if(!s.isEmpty() && s.peek()==str.charAt(i)){
                s.pop();
            }else{
                s.push(str.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c: s){
            sb.append(c);
        }

        return sb.toString();
    }
 
}
