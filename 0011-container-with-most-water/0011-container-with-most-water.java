class Solution {
    public int maxArea(int[] height) {
        int ar=0;
        int left =0;
        int right =height.length-1;
        while(left<right){
            int width = right-left;
            int hght= Math.min(height[left],height[right]);
            int curr = width*hght;
            ar=Math.max(ar,curr);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ar;
    }
}