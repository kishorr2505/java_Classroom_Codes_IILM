import java.util.Stack;

public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int idx = n-1;
        int [] result = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for(int i = n*2 -1 ;i>=0;i--){
            while(!s.isEmpty() && s.peek()<= nums[i%n]){
                s.pop();
            }

            if(!s.isEmpty()) result[i%n]  = s.peek();
            else  result[i%n] = -1;
            s.push(nums[i%n]);
        }

        // for(int i= n-1;i>=0;i--){
        //         while(!s.isEmpty() && s.peek()<= nums[i]){
        //         s.pop();
        //         }

        //         if(!s.isEmpty()) result[i] = s.peek();
        //         else result[i] = -1;
        //         s.push(nums[i]);
        // }
        
        return result;
    }


    // same loop two times 

public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int idx = n-1;
        int [] result = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i= n-1;i>=0;i--){
                while(!s.isEmpty() && s.peek()<= nums[i]){
                s.pop();
                }

                if(!s.isEmpty()) result[i] = s.peek();
                else result[i] = -1;
                s.push(nums[i]);
        }

         for(int i= n-1;i>=0;i--){
                while(!s.isEmpty() && s.peek()<= nums[i]){
                s.pop();
                }

                if(!s.isEmpty()) result[i] = s.peek();
                else result[i] = -1;
                s.push(nums[i]);
        }
        
        return result;
    }


    Stack<Integer> s = new Stack<>();
       int [] result = new int[nums.length];

       for(int i= nums.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<= nums[i]){
                s.pop();
            }

            if(!s.isEmpty()) result[i] = nums[i];
            else result[i] = -1;

            s.push(nums[i]);
       }

       for(int i= nums.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<= nums[i]){
                s.pop();
            }

            if(!s.isEmpty()) result[i] = nums[i];
            else result[i] = -1;

            s.push(nums[i]);
       }

       return result;
