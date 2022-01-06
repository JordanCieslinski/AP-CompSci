package Assignment2;

import java.util.Arrays;

public class Grid {
    private char[][] grid;
    private int width;
    private int height;

    // creates a 2D array of characters with the dimensions passed in
    // then each element in the Grid will begin as an empty space
    // height and width will also be initialized
    public Grid(int h, int w) {
        grid = new char[h][w];
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = ' ';
            }
        }
        width = w;
        height = h;
    }

    // get the number characters in the grid
    public int getNumberOfOccupiedCells() {
        int count = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != ' ')
                    count++;
            }
        }
        return count; 
    }

    // get the number of empty cells in the grid
    public int getNumberOfEmptyCells() {
        int count = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == ' ')
                    count++;
            }
        }
        return count;
    }

    // get the total number of cells in the grid
    public int getTotalNumberCells() {
        return height*width;
    }

    // return true if the row and column are in the grid
    public boolean validPosition(int row, int column) {
        if(height > row && width > column)
            return true;
        else
            return false;
    }

    // return true if the value is not a space, and the position is valid
    public boolean positionIsOccupied(int row, int column) {
        if(this.validPosition(row, column) == true){
            if(grid[row][column] != ' ')
                return true;
        }
        return false;


    }

    // return the character at the position
    // if the position isn’t valid, return a space character
    public char getCell(int row, int column) {
        if(this.validPosition(row, column) == true){
            return grid[row][column];
        }
        return ' ';
    }

    // if it’s a valid position, set the cell to the value passed in
    public void setCell(char value, int row, int column) {
        if(this.validPosition(row, column) == true){
            grid[row][column] = value;
        }
    }

    // return a string containing the entire grid in the appropriate format
    // look at the next page for the correct format
    public String toString() {
        String end = "";
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                end+="|"+grid[i][j];
            }
            end+="|\n";
        }
        return end;

    }
}
