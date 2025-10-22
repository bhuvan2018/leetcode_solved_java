import java.util.Arrays;
class Solution{
    public int majorityElement(int nums[]){
        Arrays.sort(nums);
        int freq=1, ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }else{
                freq=1;
                ans=nums[i];
            }
        }
        return ans;
    }
}
public class majorityele_sort {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,2,3};
        int result = sol.majorityElement(nums);
        System.out.println("Majority element: " + result);
    }
}