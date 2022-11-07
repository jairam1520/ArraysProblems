// Union of two arrays can be defined as the common and distinct elements in the two arrays.
// Given two sorted arrays of size n and m respectively, find their union.

//arr1,arr2 : the arrays
// n, m: size of arrays
class FindUnion
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int i=0;//iterate on arr1
        int j=0;//iterate on arr2
        
        while(i<n && j<m){
            
            //skip duplicates from arr1
            while(i+1<n && arr1[i]==arr1[i+1])i++;
            //skip duplicates from arr2
            while(j+1<m && arr2[j]==arr2[j+1])j++;
            
            //comparing unique element of arr1 and arr2
            
            if(arr1[i]<arr2[j]){
                ans.add(arr1[i]);
                i++;
            }else if(arr2[j]<arr1[i]){
                ans.add(arr2[j]);
                j++;
            }else{//if both are same update both pointers
                ans.add(arr1[i]);
                j++;
                i++;
            }
        }
        
        //if arr1 is not fully iterated
        while(i<n){
            while(i+1<n && arr1[i]==arr1[i+1])i++;
            ans.add(arr1[i]);
            i++;
        }
        //if arr2 is not fully iterated
        while(j<m){
            while(j+1<m && arr2[j]==arr2[j+1])j++;
            ans.add(arr2[j]);
            j++;
        }
        
        return ans;
    }
}
