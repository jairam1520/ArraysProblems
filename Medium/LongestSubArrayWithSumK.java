

// Given an array containing N integers and an integer K.,
// Your task is to find the length of the longest Sub-Array
// with the sum of the elements equal to the given value K.

class LongestSubArrayWithSumK{
    
   
    /*  A[] = {10, 5, 2, 7, 1, 9}
        K = 15
    
    prefixSum={10,15,17,24,25,34}
    
    let prefix[i]=x && prefix[j]=x+k where j>i
    It means that sum between i & j is k
    So if we already have x-k in our hashmap we got the sum as k
    A[i] can be negative
    */
    
    
    public static int lenOfLongSubarr (int arr[], int n, int K) {
        //Complete the function
       
       //store the prefix sum with their index
       HashMap<Integer,Integer> map = new HashMap<>();
       
       //corner case(when sum-k=0 for the first time or when k=0)
       map.put(0,-1);
       
       int size=0;
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           
           
           if(map.containsKey(sum-K)){
               size=Math.max(size,i-map.get(sum-K));
           }
           if(!map.containsKey(sum)){
               map.put(sum,i);
           }
           
           
       }
       return size;
    }
    
    
}


