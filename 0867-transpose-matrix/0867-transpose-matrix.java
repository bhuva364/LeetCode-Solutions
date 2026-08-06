class Solution {
    public int[][] transpose(int[][] arr) {
        int row=arr.length;
        int cols=arr[0].length;
        int transpose [][]=new int[cols][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=arr[i][j];
            }
        }

        return transpose;
    }
}