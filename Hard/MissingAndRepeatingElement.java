// Traverse the array. While traversing, use the absolute value
// of every element as an index and make the value at this index
// as negative to mark it visited. If something is already marked
// negative then this is the repeating element. 
// To find missing, traverse the array again and look for a positive value.

class MissingAndRepeatingElement {
    int[] findTwoElement(int arr[], int n) {
        // code here
        
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            int abs_value=Math.abs(arr[i]);
            
            if(arr[abs_value-1] >0){
                arr[abs_value-1]*=-1;
            }else{
                ans[0]=abs_value;
            }
        }
        //System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[1]=i+1;
            }
        }
        
        return ans;
    }
}
