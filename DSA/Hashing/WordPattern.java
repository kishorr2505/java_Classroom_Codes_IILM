// Question 290
// https://leetcode.com/problems/word-pattern/description/
class Solution {
    public boolean wordPattern(String pattern, String s) {
      
        String [] str = s.split(" ");
        Map<String,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>(); 
        if(pattern.length() != str.length) return false;

        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(str[i])){
                if(set.contains(pattern.charAt(i))) return false;
                else{
                    map.put(str[i],pattern.charAt(i));
                    set.add(pattern.charAt(i));
                }
            }else{
                if(map.get(str[i])!= pattern.charAt(i)) return false;
            }
        }
        return true;  
    }
}