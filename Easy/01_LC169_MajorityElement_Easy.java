class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[i];
        int votes=1;

        for(int i =1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }
            else if(majoruty==nums[i]);
            votes++;
        }
        else{
            votes--;
        }
    }
    return majority;
}
}
