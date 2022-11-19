// Given an array of integers. Find the Inversion Count in the array. 

// Inversion Count: For an array, inversion count indicates how far 
// (or close) the array is from being sorted. If array is already sorted
// then the inversion count is 0. If an array is sorted in the reverse 
// order then the inversion count is the maximum. 
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

class CountInversions
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        
        return mergeSort(arr,0,arr.length-1);
    }
    static long mergeSort(long[] arr,int l,int h){
        long count=0;
        
        if(l<h){
            int m=(l+h)/2;
            
            count+=mergeSort(arr,l,m);
            count+=mergeSort(arr,m+1,h);
            count+=merge(arr,l,m,h);
        }
        return count;
    }
    static long merge(long[] arr,int l,int mid,int h){
        long count=0;
        long[] L = Arrays.copyOfRange(arr,l,mid+1);
        long[] R = Arrays.copyOfRange(arr,mid+1,h+1);
        
        int i=0;
        int j=0;
        int k=l;
        while(i<L.length && j<R.length ){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            } 
            else{
                arr[k++]=R[j++];
                count+=L.length-i;
            }
        }
        while(i<L.length) arr[k++]=L[i++];
        while(j<R.length) arr[k++]=R[j++];
        return count;
        
    }
}
