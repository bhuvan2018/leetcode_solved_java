import java.util.Arrays;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i+=2){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        return nums;
    }
}
public class wave_array {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums[] = {3, 6, 5, 10, 7, 20};
        int result[] = sol.rearrangeArray(nums);
        System.out.print("The rearranged array in wave form is: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}