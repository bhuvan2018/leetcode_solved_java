import java.lang.Math;
public class container_with_most_water {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left < right){
            int currArea = Math.min(height[left],height[right])*(right-left);
            if (currArea > maxArea){
                maxArea = currArea;
            }
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}