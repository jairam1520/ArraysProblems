
//Given an unsorted array Arr of N positive and negative numbers.
//Your task is to create an array of alternate positive and negative
//numbers without changing the relative order of positive and negative numbers.
//Note: Array should start with a positive number.
class RearrangePositiveNegativeAlternatively {
    void rearrange(int arr[], int n) {
        // code here
        
       
        ArrayList<Integer> ptive = new ArrayList<>();
        ArrayList<Integer> ntive = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ptive.add(arr[i]);
            }
            else {
                ntive.add(arr[i]);
            }
        }
        
        int i=0;
        int j=0;
        int k=0;
        while(i<ptive.size() && j<ntive.size()){
            if(k%2==0){
                arr[k]=ptive.get(i++);
            }
            else {
                arr[k]=ntive.get(j++);
            }
            k++;
        }
        
        while(i<ptive.size()){
            arr[k++]=ptive.get(i++);
        }
         while(j<ntive.size()){
            arr[k++]=ntive.get(j++);
        }
    }
   
}
