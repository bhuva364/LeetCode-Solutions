class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
        int n = matrix.length;
        int s = matrix[0][0];
        int l = matrix[n - 1][n - 1];

        while(s < l)
        {
            int m = s + (l - s) / 2;
            int c = count(matrix, m, n);
            
            if(c < k)
            {
                s = m + 1;
            }
            else
            {
                l = m;
            }
        }

        return l;
    }
    int count(int[][] matrix, int t, int n)
    {
        int c = 0;

        for(int[] mat : matrix)
        {
            int l = 0;
            int r = n;

            while(l < r)
            {
                int m = l + (r - l) / 2;

                if(mat[m] <= t)
                {
                    l = m + 1;
                }
                else
                {
                    r = m;
                }
            }

            c += l;
        }

        return c;
    }
}