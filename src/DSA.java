import java.sql.Array;
import java.util.*;
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int countOccurence = 0;
        int left =0;
        int right =0;
        int maxElement = 0;
        int result=0;
        for(int num : nums){
            maxElement = Math.max(maxElement,num);
        }
        while(right<nums.length){
            if(nums[right] == maxElement){
                countOccurence++;
            }
            while(countOccurence>=k){
                result += nums.length - right;
                if(nums[left] == maxElement)countOccurence--;
                left++;
            }
            right++;
        }
        return result;
    }
}

public class DSA {
    public static void main(String[] args) {
        int[] arr ={1,3,2,3,3};
//        int[][] arr2 ={{7,2,9},{1,5,0},{2,6,6}};
        int[] arr2 = {2,3,1,2,4,3};
        String[] arr3 = {"a","aba","ababa","aa"};
        Solution d1 = new Solution();
        String order = "hucw";
        String s= "dvdf";
        char c= 'z';
        System.out.println(d1.countSubarrays(arr,2));
//       System.out.println(Arrays.toString(d1.intersection(arr,arr2)));
//        int n = 16;
//        System.out.println(n&(n-1));
//        int a = (int) Math.pow(10,8);
//        System.out.println(a);
    }
}
