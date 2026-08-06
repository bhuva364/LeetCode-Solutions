class Solution {
    public long[] sumOfThree(long num) {
        long a[]=new long[0];
        long sum[]=new long[3];
      if(num%3!=0){
          return a;
      }else{
          sum[0]=(num/3)-1;
          sum[1]=(num/3);
          sum[2]=(num/3)+1;
      
        return sum;
    }
}
}