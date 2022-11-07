// Given an array arr[] of N positive integers.
// Push all the zeros of the given array to the
// right end of the array while maitaining the
// order of non-zero elements.
class PushZerosToEnd {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        
        //count zeros
        int zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)zeros++;
        }
        
        //modify array such that all non zero elements are together
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        
        //start from last of array and make elements 0 until zero count
        //is greater than 0;
        j=n-1;
        while(zeros>0){
            arr[j--]=0;
            zeros--;
        }
    }
}
