class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rowArr = new ArrayList<>();
        ArrayList<Integer> colArr = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    colArr.add(j);
                    if(!rowArr.contains(i))
                        rowArr.add(i);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (rowArr.contains(i) || colArr.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}