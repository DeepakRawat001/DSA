package DSA.DP;

public class MaximumAlternatingSubsequenceSum {
    int[] dp;
    long solve(int index, boolean flag, int[] nums){
        if(index >= nums.length)return 0;
        long skip = solve(index+1,flag,nums);
        long val = nums[index];
        if(!flag){
            val = -val;
        }
        long take = val + solve(index+1,!flag,nums);
        return Math.max(take,skip);
    }
    public long maxAlternatingSum(int[] nums) {
        return solve(0,true,nums);
    }

    public static void main(String[] args) {
        int[] nums = {6,2,1,2,4,5};
        MaximumAlternatingSubsequenceSum obj = new MaximumAlternatingSubsequenceSum();
        System.out.println(obj.maxAlternatingSum(nums));
    }
}
