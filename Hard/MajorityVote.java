/*
You are given a list of integers nums where each number represents a vote to a candidate. 
Return the ids of the candidates that have greater than n/3 votes, If there's not a majority 
vote, return -1. 
*/

/*
We can have atmost 2 elements who have frequency greater then n/3
Let we have 3 elements with freq greater then n/3 
(n/3+1)+(n/3+1)+(n/3+1)=n+3(not possible since array size is n).

Let we have 2 elements with freq greater then n/3 
(n/3+1)+(n/3+1)=2n/3+2 <=n (possible for n greater then 3)
let n=4 , 2*4/3+2 = 4
let n=5 , 10/3+2 = 5

Let we have 1 element1 with freq greater then n/3 
(n/3+1)<=n (which is possible for every integer n)
let n=4 , 2*4/3+2 = 4<=n
let n=5 , 10/3+2 = 5<=n

So it is clear that we can have atmost 2 elements with frequency greater than n/3
Morre's voting algorithm can be used to solve this problem with minor changes.
*/
class MajortyVote{

      public static ArrayList<Integer> Solve(int n, int[] nums) {
      
            //initialize two variable which can be our majority element;
            int num1=-1;
            int num2=-1;
            //initialize two count variable to hold the frequency of two num
            int count1=0;
            int count2=0;
            
            for(int i=0;i<n;i++){
            
                if(nums[i] == num1){         //  num1 is already equal to nums[i],
                  count1 = count1 + 1;     //  so we will increase its frequency by 1
                }
                else if(nums[i] == num2){    //  num2 is already equal to nums[i],
                  count2 = count2 + 1;     //  so we will increase its frequency by 1
                }
                else if(count1 == 0){        // frequency of num1 is 0, it means num1 is not initialized till now, 
                  num1 = nums[i];          // so we will initialize it with nums[i] and increase its frequency by 1
                  count1 = count1 + 1;                 
                }
                else if(count2 == 0){        // frequency of num1 is 0, it means num1 is not initialized till now,
                  num2 = nums[i];          // so we will initialize it with nums[i] and increase its frequency by 1
                  count2 = count2 + 1;                 
                }
                else{
                  count1 = count1 - 1;     // If none of the statements holds true, 
                  count2 = count2 - 1;     // deacrease the frequency of both num1 and num2(current element does not match with both the nums)       
                }
              }
              
              //we will get the element in nums1 and nums2 which may have freq greater than n/3
              //to verify we need to count their frequency
              count1=0;
              count2=0;
              for(int i:nums){
                if(i==num1)count1++;
                if(i==num2)count2++;
              }
               ArrayList<Integer> ans = new ArrayList<>();
        
              if(count1>n/3)ans.add(num1);
              if(count2>n/3)ans.add(num2);
              if(ans.size()==0)ans.add(-1);
        
              return ans;
      }
}
