class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
           return false;
        //！！一定要有数组length为0的判断否则matrix[0].length - 1可能越界导致执行出错！！
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(target > matrix[row][col]){
                row++;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
