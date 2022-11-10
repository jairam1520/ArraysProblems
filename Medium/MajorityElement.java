************MOORE'S VOTING ALGORITHM*************
// Given an array A of N elements. Find the majority element in the array.
// A majority element in an array A of size N is an element that appears
// more than N/2 times in the array.
class MajorityElement
{
  /* ALGORITHM-->
  Pick the first value. Iterate through the array, keeping track of a count
  of times you see that value, and subtracting one every time you see a different
  value. If you hit 0, you take the new value, and continue the process with this
  new value being the one you count. ThE value you have at the end is your candidate.
  This algo returns majority element if exist or the element with highest freq.
  To verify we again iterate and check the count of element returned by algo.
  */
    
    static int majorityElement(int a[], int size)
    {
        // your code here
        if(size==1)return a[0];
        
        int candidate=-1;//majority element
        int vote=0;
        for(int i=0;i<size;i++){
            if(vote==0){
                candidate=a[i];
                vote=1;
            }else if(a[i]==candidate){
                vote++;
            }
            else if(a[i]!=candidate){
                vote--;
            }
           
        }
       //verifying the returned value of algo
        int count=0;
        for(int i=0;i<size;i++){
            if(a[i]==candidate)count++;
        }
        return count>(size/2)?candidate:-1;
    }
}
