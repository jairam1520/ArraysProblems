/*
Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice,
except for one number which will occur only once. Find the number occurring only once.
*/

class FindElement
{
    public static int search(int arr[], int N)
    {
        //corner case
        if(N==1)return arr[0];
        if(arr[0]!=arr[1])return arr[0];
        if(arr[N-1]!=arr[N-2]) return arr[N-1];
        
        //approach
        //every element 1st instance will start from even index and 2nd instance at odd index
        //we will get odd-even pattern for starting and ending index for each element
        //once our target element occur odd-even pair will change to even-odd
        //so if mid is even index check its next odd index (2nd instance)if odd-even pattern is present
        //means our element is still not occured and present at right half
        //if mid is odd then we check its previous even index (1st instance)if odd-even patter is present
        //means our element is still not occured and present at right half
        //if odd-even pattern is not observed means our element is present at left array
        int low=0;
        int high=N-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            //element found
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])return arr[mid];
            
            //mid is odd
            if(mid%2==1){
                //odd even pattern is followed(element not occured,present at right of mid)
                if(arr[mid-1]==arr[mid]){
                    low=mid+1;
                }else{//odd even pattern is not followed(element occured,present at left of mid)
                    high=mid-1;
                }
            }else{//mid is even
            
                //odd even pattern is followed(element not occured,present at right of mid)
                if(arr[mid+1]==arr[mid]){
                    low=mid+1;
                }else{//odd even pattern is not followed(element occured,present at left of mid)
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
