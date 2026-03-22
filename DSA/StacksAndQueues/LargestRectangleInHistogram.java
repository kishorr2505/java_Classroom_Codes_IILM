// Question 84 
//https://leetcode.com/problems/largest-rectangle-in-histogram/description/

// Approach - find the next smaller and previous smaller height bars

class Solution {
    public int[] previousSmaller(int []height, int n){
        Stack<Integer> s = new Stack<>();
        int []psm = new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && height[s.peek()]>= height[i] ){
                s.pop();
            }
            if(!s.isEmpty()) psm[i] = s.peek();
            else psm[i] = -1;

            s.push(i);
        }

        return psm;
    }

    public int[] nextSmaller(int []height, int n){
        Stack<Integer> s = new Stack<>();
        int []nsm = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && height[ s.peek()]>= height[i] ){
                s.pop();
            }
            if(!s.isEmpty()) nsm[i] = s.peek();
            else nsm[i] = n;

            s.push(i);
        }

        return nsm;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int prevSmallerEle[] = previousSmaller(heights,n);
        int nextSmallerEle[] = nextSmaller(heights,n);
        for(int num:prevSmallerEle){
            System.out.print(num +" ");
        }
         System.out.println();
        for(int num:nextSmallerEle){
            System.out.print(num + " ");
        }
        int maxArea = 0;

        for(int i=0;i<n;i++){
            maxArea  = Math.max(maxArea, heights[i]*(nextSmallerEle[i]-prevSmallerEle[i]-1));
        }
        return maxArea;
    }
}


// More optimised in one go

class Solution {
    
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int n = heights.length;
        int nsm, psm,idx;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]> heights[i]){
                idx = s.pop();
                nsm = i;
                psm = s.isEmpty() ? -1 : s.peek();
                maxArea = Math.max(maxArea, heights[idx]* (nsm-psm-1));
            }
            s.push(i);
        }

        while(!s.isEmpty()){
            nsm = n;
            idx = s.pop();
            psm = s.isEmpty() ? -1 : s.peek();
            maxArea = Math.max(maxArea, heights[idx] *(nsm-psm-1));
        }
        return maxArea;
    }
}