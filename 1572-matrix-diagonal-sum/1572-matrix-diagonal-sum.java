class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        // int ans[][] = new int[n][n];
        int sum = 0;

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat.length; j++){
                if(i == j || i + j == n-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;

    }
}