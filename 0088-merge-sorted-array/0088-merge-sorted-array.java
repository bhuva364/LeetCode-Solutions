class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        int a=0;
      int b=0;
      int i=0;
      while(a<m && b<n){
        if(nums1[a]<nums2[b]){
         arr[i]=nums1[a];
         a++;
        }else{
            arr[i]=nums2[b];
             b++;
        }
        i++;
      }
      while(a<m){
        arr[i]=nums1[a];
        i++;
        a++;
      }
      while(b<n){
        arr[i]=nums2[b];
        i++;
        b++;
      }
      for(int k=0;k<nums1.length;k++){
        nums1[k]=arr[k];
      }
    
    }
}