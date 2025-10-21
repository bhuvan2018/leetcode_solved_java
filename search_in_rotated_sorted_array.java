class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = sol.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}