class Solution {
    public void swapFunc(int[]nums , int i , int j){
        int temp = nums[i] ; 
        nums[i] = nums[j] ; 
        nums[j] = temp ; 
    }
    public int[] sortArrayByParityII(int[] nums) 
    {
        int n = nums.length ;
        int even = 0 , odd = 1 ; 

        while(even < n && odd < n){
            if(nums[even]%2!=0 && nums[odd]%2 == 0){
                swapFunc(nums , even , odd) ; 
                even+=2 ; odd+=2 ; 
            }
            else if(nums[even]%2 == 0 && nums[odd]%2!=0){
                even+=2 ; odd+=2 ; 
            }
            else{
                if(nums[even]%2 == 0)even+=2 ; 
                else if(nums[odd]%2!=0)odd+=2 ;
            }
        }
        return nums ; 
    }
}


// t.c : o(n) s.c : o(1)
