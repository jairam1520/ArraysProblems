// Given an array arr[] of size N and an integer K,
// the task is to left rotate the array K indexes
class QuickLeftRotation
{
    
//**************APPROACH***************************************
// Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], k =2 and n = 7
// A = [1, 2] and B = [3, 4, 5, 6, 7]

// Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
// Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
// Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
//**************APPROACH*****************************************
    void leftRotate(long arr[], int k,int n)
    {
        
        k=k%n; //since k can be larger than n
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    void reverse(long[]arr,int s,int e){
        while(s<e){
            long temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
