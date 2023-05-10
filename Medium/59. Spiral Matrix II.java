class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; 
        int topRow = 0, bottomRow = n - 1; 
        int leftCol = 0, rightCol = n - 1; 
        
        while (num <= n * n) {
            for (int col = leftCol; col <= rightCol; col++) {
                matrix[topRow][col] = num++;
            }
            topRow++;
            
            for (int row = topRow; row <= bottomRow; row++) {
                matrix[row][rightCol] = num++;
            }
            rightCol--;
            for (int col = rightCol; col >= leftCol; col--) {
                matrix[bottomRow][col] = num++;
            }
            bottomRow--;
            for (int row = bottomRow; row >= topRow; row--) {
                matrix[row][leftCol] = num++;
            }
            leftCol++;
        }
        
        return matrix;
    }
}
