import java.util.*;


class HappyNumber{
    //  using HashSet takes O(log n) time and space

    // public static boolean isHappy(int n){
    //     HashSet<Integer>set = new HashSet<>();

    //     while(n!=1){
    //         if(set.contains(n)){
    //             return false;
    //         }
    //         set.add(n);

    //         n = sumOfsquareOfDigit(n);
    //     }
    //     return true;
    // }

    // using fast and slow pointers takes O(log n) time and O(1)space
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = sumOfsquareOfDigit(slow);
            fast = sumOfsquareOfDigit(sumOfsquareOfDigit(fast));
        }while(slow != fast && fast !=1);
        return fast==1;
    }

    public static int sumOfsquareOfDigit(int n){
        int rem=0;
        int result=0;
        while(n>0){
            rem = n%10;

            result += rem*rem;
            n = n/10;

        }
        return result;
    }
    public static void main(String[] args){
            System.out.println(" "+ isHappy(100));
    }
}