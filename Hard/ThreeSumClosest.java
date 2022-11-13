// Given an array A[] of N integers and an integer X. 
// The task is to find the sum of three integers in A[] such that it is closest to X.
// Input:
// N = 4
// A[] = {-1 , 2, 1, -4}
// X = 1
// Output: 2
// Explaination: 
// Sums of triplets:
// (-1) + 2 + 1 = 2
// (-1) + 2 + (-4) = -3
// 2 + 1 + (-4) = -1
// 2 is closest to 1.
// Constraints:
// 3 ≤ N ≤ 103
// -103 ≤ Arr[i] ≤ 103
// -104 ≤ X ≤ 104
class ThreeSumClosest
{
    static int closest3Sum(int arr[], int N, int X)
    {

        Arrays.sort(arr);
        
        int ans = arr[0]+arr[1]+arr[N-1]; // or ans = Integer.MAX_VALUE;
        
        //fix the one element
        for(int i=0;i<N-2;i++){
            
            //using two two pointer to find other 2 elements
            int low=i+1;
            int high=N-1;
            
            while(low<high){
                
                int sum=arr[i]+arr[low]+arr[high];
                
                //if current triplet sum is more closer to X then previous triplet sum
                //update the previous triplet sum(ans)
                if(Math.abs(X-sum)<Math.abs(X-ans)){
                    ans=sum;
                }
                
                //if target is greater then sum we need to add greater value so increment low ptr
                if(X>sum)low++;
                else high--;//if sum is greater than target we need to reduce sum so dec high ptr
            }
        }
        
        return ans;
    }
}
