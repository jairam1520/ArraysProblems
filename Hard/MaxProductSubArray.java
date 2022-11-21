//QUESTION:Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.


class MaxProductSubArray {
    //************************ APPROACH********************
// Idea is to find the maximum product from both sides,i.e, once in a forwarding direction and another in the backward direction.

// Following are the steps for the approach:

// Iteration from left to right once to get maximum product for forward direction.
// If zero is encountered, we set all variables again to initial value.
// Iteration from right to left once again to get maximum product for backward direction.
// If zero is encountered, we set all variables again to zero to find a new subarray with maximum product.
// Once both iterations are completed, the overall result for the maximum product subarray of the given array is the maximum product obtained from both the iterations. 

    long maxProduct(int[] arr, int n) {
        // code here
        
        long prod=1;
        long maxProd=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            prod*=arr[i];
            maxProd=Math.max(prod,maxProd);
            
            if(arr[i]==0)prod=1;
            
        }
        prod=1;
        for(int i=n-1;i>=0;i--){
            prod*=arr[i];
            maxProd=Math.max(prod,maxProd);
            
            if(arr[i]==0)prod=1;
            
        }
        return maxProd;
    }
}
