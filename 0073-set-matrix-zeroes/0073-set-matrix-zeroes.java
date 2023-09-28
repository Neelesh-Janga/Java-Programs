class Solution {
    public void setZeroes(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        byte [] rowArr = new byte[rowSize];
        byte [] colArr = new byte[colSize];

        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < colSize; j++){
                if (matrix[i][j] == 0){
                    if (rowArr[i] == 0) rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }

        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < colSize; j++){
                if (rowArr[i] == 1 || colArr[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}