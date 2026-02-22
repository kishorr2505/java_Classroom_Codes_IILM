 // Optimized Approach
 // Questio 238 
 // link = https://leetcode.com/problems/product-of-array-except-self/description/
 class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int prefixProduct = 1;
        int suffixProduct = 1;
         int []product = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product[i] = prefixProduct;

            prefixProduct *= nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            product[i] *= suffixProduct;

            suffixProduct *= nums[i];

        }
        return product;
    
}    
}
