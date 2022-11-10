// Given two unsorted arrays A of size N and B of size M of distinct
// elements, the task is to find all pairs from both arrays whose sum
// is equal to X.

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class FindPairs {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<pair> ans = new ArrayList<pair>();
        
        
        int i=0;
        int j=(int)M-1;
        while(i<N && j>=0){
            if(A[i]+B[j]>X){
                j--;
            }else if(A[i]+B[j]<X){
                i++;
            }else{
                ans.add(new pair(A[i],B[j]));
                i++;
                j--;
            }
        }
        pair[] pairs = new pair[ans.size()];
        for(int k=0;k<ans.size();k++)pairs[k]=ans.get(k);
        return pairs;
    }
}
