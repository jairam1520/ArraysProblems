/*
Given an array A of positive integers. Your task is to find
the leaders in the array. An element of array is leader if it
is greater than or equal to all the elements to its right side. 
The rightmost element is always a leader. 
*/
class Leaders{

    static ArrayList<Integer> leaders(int arr[], int n){

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(n==1){
            ans.add(arr[0]);
            return ans;
        }
        
        int i=n-2;
        //initialize the last element as the leader
        int leader=arr[n-1];
        ans.add(leader);
        
        //compare the rest element if they are greater then current leader then
        //initialize the leader as current leader
        while(i>=0){
            if(arr[i]>=leader){
                leader=arr[i];
                ans.add(arr[i]);
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}
