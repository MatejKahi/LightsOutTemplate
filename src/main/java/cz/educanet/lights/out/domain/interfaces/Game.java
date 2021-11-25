package cz.educanet.lights.out.domain.interfaces;

public class Game implements ILightsOut {
    public Game(int x, int y) {
        this.grid = new boolean[x][y];
        this.grid[2][0] = true;
        this.grid[2][2] = true;
        this.grid[2][4] = true;
    }

    private int moveCount;
    private boolean[][] grid;

    private void swap(int x, int y) {
        if (grid[x][y] == true)
            grid[x][y] = false;
        else
            grid[x][y] = true;
    }

    @Override
    public int getMoveCount() {
        return moveCount;
    }

    @Override
    public boolean isGameOver() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == true)
                    return false;
            }
        }
        return true;
    }

    @Override
    public boolean[][] getGrid() {
        return grid;
    }

    @Override
    public void makeMove(int x, int y) {
moveCount++;
swap(x, y);
if (x - 1 >= 0)swap(x - 1,y);
if (x + 1 < grid.length)swap(x + 1,y);
if (y - 1 >= 0)swap(x,y - 1);
if (y + 1 < grid[x].length)swap(x,y + 1);
    }
}
