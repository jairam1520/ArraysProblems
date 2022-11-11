// Given an array of positive integers. Find the length of
// the longest sub-sequence such that elements in the subsequence
// are consecutive integers, the consecutive numbers can be in any
// order.

class FindLongestConseqSubseq
{   
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add array element to hashset
	   HashSet<Integer> set = new HashSet<>();
	   for(int i:arr){
	       set.add(i);
	   }
	   
	   int maxSize=0;
	   
	   for(int num:arr){
	       //starting element for each sequence
	       if(!set.contains(num-1)){
	           int currSize=1;
	           int currNum=num;
	           
	           //check if next element exist
	           while(set.contains(currNum+1)){
	               currSize++;
	               currNum++;
	           }
	           //update the maxSize
	           maxSize=Math.max(currSize,maxSize);
	       }
	   }
	   return maxSize;
	}
}
