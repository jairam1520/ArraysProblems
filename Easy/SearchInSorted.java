// Given an array arr[] sorted in ascending order of size N
// and an integer K. Check if K is present in the array or not.
//***************BINARY SEARCH*************************
class SearchInSorted{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int l=0;
        int h=N-1;
        
        while(l<=h){
            int mid=(l+h)/2;
            
            if(arr[mid]==K)return 1;
            
            if(arr[mid]<K){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;
        
    }
}
