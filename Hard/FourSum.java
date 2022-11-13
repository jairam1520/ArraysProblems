// Given an array of integers and another number. 
// Find all the unique quadruple from the given array
// that sums up to the given number
// arr[] : int input array of integers
// k : the quadruple sum required

class FourSum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n=arr.length;
        
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            
            
            for(int j=i+1;j<n;j++){
                //fix two elements first
                int target = k-arr[i]-arr[j]; 
                
                int low=j+1;
                int high=n-1;
                //search rest two using two pointer technique
                while(low<high){
                    int twoSum=arr[low]+arr[high];
                    
                    //if current quadraplet sum is less than k inc low ptr
                    if(twoSum<target){
                        low++;
                    }else if(twoSum>target){// if curr quadraplet sum is greater dec high ptr
                        high--;
                    }else{// if required sum is achived
                        ArrayList<Integer> quadra = new ArrayList<Integer>();
                        quadra.add(arr[i]);
                        quadra.add(arr[j]);
                        quadra.add(arr[low]);
                        quadra.add(arr[high]);
                        
                        ans.add(quadra);
                        
                        //skip duplicates of 3rd choosed number(low)
                        while(low<high && arr[low]==quadra.get(2))low++;
                        
                        //skip duplicates of 4th choosed number(high)
                        while(low<high && arr[high]==quadra.get(3))high--;
                    
                    }
                    
                   
                    
                }
                //skip duplicates of 2nd choosed number(j)
                while(j+1<n && arr[j]==arr[j+1])++j;
            }
            //skip duplicates of 1st choosed number(i)
            while(i+1<n && arr[i]==arr[i+1])++i;
        }
        
        return ans;
        
    }
}
