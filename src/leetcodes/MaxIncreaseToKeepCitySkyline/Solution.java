package leetcodes.MaxIncreaseToKeepCitySkyline;

public class Solution {


    public int maxIncreaseKeepingSkyline(int[][] grid) {

        //Max value to a building will be the lesser of maxValueInRow and maxValueInColumn
        int heightSum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(getMaxValueInColumn(grid, j) > getMaxValueInRow(grid, i)){
                    heightSum = heightSum + getMaxValueInRow(grid, i) - grid[i][j];
                }else{
                    heightSum = heightSum + getMaxValueInColumn(grid, j) - grid[i][j];

                }

            }
        }
        return heightSum;
    }

    public int getMaxValueInRow(int[][] grid, int row){
        int maxValue = 0;

        for(int i = 0; i < grid.length; i++){
            if(grid[row][i] > maxValue){
                maxValue = grid[row][i];
            }
        }

        return maxValue;
    }
    public int getMaxValueInColumn(int[][] grid, int column){
        int maxValue = 0;

        for(int i = 0; i < grid.length; i++){
            if(grid[i][column] > maxValue){
                maxValue = grid[i][column];
            }
        }

        return maxValue;
    }
}
