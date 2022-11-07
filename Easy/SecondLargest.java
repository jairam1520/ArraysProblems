//Given an array Arr of size N, print second largest element from an array.

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        int largest=0;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
        }
        int seclargest=-1;
        for(int i=0;i<n;i++){
            
            if(arr[i]==largest)continue;
            seclargest=Math.max(seclargest,arr[i]);
        }
        return seclargest;
        
    }
}
