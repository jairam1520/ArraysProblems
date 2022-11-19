// Given an integer array nums, return the number of reverse pairs in the array.

// A reverse pair is a pair (i, j) where:

// 0 <= i < j < nums.length and
// nums[i] > 2 * nums[j].

class ReversePairs {
    public int reversePairs(int[] arr) {
        return mergeSort(arr,0,arr.length-1);
    }
    public static int mergeSort(int[] arr,int l,int h){
        int count=0;
        
        if(l<h){
            int m=(l+h)/2;
            
            count+=mergeSort(arr,l,m);
            count+=mergeSort(arr,m+1,h);
            count+=merge(arr,l,m,h);
        }
        return count;
    }
    public static int merge(int[] arr,int l,int mid,int h){
        
        int max_cnt = 0;
        int c2 = mid+1;
        for (int c1=l;c1<=mid;c1++){
            while (c2<=h && arr[c1] > (2*(long)arr[c2])) c2++;
            max_cnt += c2 - (mid+1);
        }
        int[] L = Arrays.copyOfRange(arr,l,mid+1);
        int[] R = Arrays.copyOfRange(arr,mid+1,h+1);
        
        int i=0;
        int j=0;
        int k=l;
        while(i<L.length && j<R.length ){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            } 
            else{
                arr[k++]=R[j++];
            }
        }
        while(i<L.length) arr[k++]=L[i++];
        while(j<R.length) arr[k++]=R[j++];
        return max_cnt;
        
    }
}
