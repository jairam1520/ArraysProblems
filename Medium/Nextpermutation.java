class Nextpermutation{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        
        int i=N-2;
        
        //iterate from end and find element such that it is greater to its next element
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        //not a last permutation
        if(i>=0){
            int j=N-1;
            //iterate from end find such element which is greater than arr[i]
            while(arr[j]<=arr[i])j--;
            
            //swap both elements
            swap(arr,i,j);
            
            reverse(arr,i+1,j);
        }//if last permutation ,just reverse entire array to get first permutation
        else reverse(arr,0,N-1);
        List<Integer> ans = new ArrayList<>();
        for(int e:arr)ans.add(e);
        
        return ans;
        
    }
    public static void reverse(int[]arr, int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
