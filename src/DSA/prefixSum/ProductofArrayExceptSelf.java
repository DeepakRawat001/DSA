//https://leetcode.com/problems/product-of-array-except-self/description/
package DSA.prefixSum;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixProdFromStart = new int[nums.length];
        int[] prefixProdFromEnd = new int[nums.length];
        prefixProdFromStart[0]=nums[0];
        int length = nums.length;
        prefixProdFromEnd[length-1]=nums[length-1];
        //nums = [1,2,3,4]
        //to fill the prefixProdFromStart
        for(int i=1;i<length;i++){
            prefixProdFromStart[i]=prefixProdFromStart[i-1]*nums[i];
        }

        //to fill the prefixProdFromEnd
        for(int i=length-2;i>=0;i--){
            prefixProdFromEnd[i]=prefixProdFromEnd[i+1]*nums[i];
        }

        //fill the result array
        result[0] = prefixProdFromEnd[1];
        result[length-1] = prefixProdFromStart[length-2];
        for(int i=1;i<length-1;i++){
            result[i] = prefixProdFromStart[i-1]*prefixProdFromEnd[i+1];
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {-1,1,0,-3,3};
        ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }
}
