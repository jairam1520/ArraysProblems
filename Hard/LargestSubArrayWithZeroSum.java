// Given an array having both positive and negative integers. 
// The task is to compute the length of the largest subarray with sum 0.
class LargestSubArrayWithZeroSum
{
    // Approach
    // The idea is to store prefix sum in map
    // If the map already contains current prefix sum it means the subarray between these two
    // sum has sum zero.
    // Eg:
    // A[] = {15,-2,2,-8,1,7,10,23}
    // P[] = {15,13,17,9,10,17,27,50}
    
    // P[] is prefix sum
    // We can see that 17 appeared twice the reason is after 1st occurence of 17
    // it was reduced to 0 and and again few elements were added to make it 17
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int maxSize=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                maxSize=Math.max(maxSize,i-map.get(sum));
            }
            else
                map.put(sum,i);
        }
        
        return maxSize;
    }
}
