public class dutch_national_flag_sort_color{
    public void sortColors(int[] nums){
        int n=nums.length-1;
        int low=0,mid=0,high=n;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low++]=nums[mid];
                nums[mid++]=temp;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high--]=temp;
            }
        }
    }
}