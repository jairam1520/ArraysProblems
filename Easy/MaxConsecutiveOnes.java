//Given a binary array nums, return the maximum number of consecutive 1's in the array.
class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int j=0;
        while(j<nums.length && nums[j]==0)j++;
        int maxCount=0;
        for(int i=j;i<nums.length;i++){
            int count=0;
            while(i<nums.length && nums[i]==1){
                count++;
                i++;
            }
            maxCount=Math.max(count,maxCount);

        }
        return maxCount;
    }
}
