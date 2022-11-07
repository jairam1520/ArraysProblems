//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


/*Given a sorted array A[] of size N, delete all 
the duplicated elements from A[]. Modify the array
such that if there are X distinct elements in it 
then the first X positions of the array should be
filled with them in increasing order and return 
the number of distinct elements in the array.*/

class RemoveDuplicates {
    int remove_duplicate(int A[],int N){
        // code here
        
        int j=0;
        for(int i=0;i<N-1;i++){
          
            //if adjacent elements are unique
            if(A[i]!=A[i+1]){
                A[j]=A[i];
                j++;
            }
        }
        //last element can't be compared with anyone so just add it
        A[j++]=A[N-1];
        return j;
    }
}
