class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int yDiff = coordinates[1][1] - coordinates[0][1];
        int xDiff = coordinates[1][0] - coordinates[0][0];
        
        for(int i = 2; i < coordinates.length; i++){
            if(
                yDiff * (coordinates[i][0] - coordinates[0][0])
                !=
                xDiff * (coordinates[i][1] - coordinates[0][1])
                ) return false;
        }

        return true;
    }
}