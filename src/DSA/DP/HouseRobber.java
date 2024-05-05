package DSA.DP;

public class HouseRobber {
    int solve(int index, int[] nums){
        if(index>=nums.length)return  0;
        int take = 0;
        int skip = 0;
        take = nums[index] + solve(index+2,nums);
        skip = solve(index+1,nums);
        return Math.max(take,skip);
    }
    public int rob(int[] nums) {
        return solve(0,nums);
    }

    public static void main(String[] args) {
        HouseRobber obj = new HouseRobber();
        int[] nums = {2,7,9,3,1};
        System.out.println(obj.rob(nums));
    }
}

//memoization
//class Solution {
//    int[] dp = new int[101];
//    public  int solve(int[] nums,int i, int end){
//        if(i>=end)return 0;
//        if(dp[i] != -1){
//            return dp[i];
//        }
//        int steal = nums[i] + solve(nums,i+2,end);
//        int skip = solve(nums,i+1,end);
//        return dp[i] = Math.max(steal,skip);
//    }
//    public int rob(int[] nums) {
//        Arrays.fill(dp,-1);
//        return solve(nums,0,nums.length);
//    }
//}
