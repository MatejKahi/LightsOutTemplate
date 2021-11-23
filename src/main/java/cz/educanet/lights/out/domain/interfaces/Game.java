package cz.educanet.lights.out.domain.interfaces;

public class Game implements ILightsOut{
    @Override
    public int getMoveCount() {
        return 0;
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public boolean[][] getGrid() {
        return new boolean[5][5];
    }

    @Override
    public void makeMove(int x, int y) {

    }
}
