/*******KADANE'S ALGORITHM*********/

// Given an array Arr[] of N integers. Find the contiguous 
// sub-array(containing at least one number) which has the 
// maximum sum and return its sum.
class MaxSubarraySum{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        int currSum=0;
        int maxSum=arr[0];
        
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
        
    }
    
}

