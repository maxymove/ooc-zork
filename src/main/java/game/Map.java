package game;

public class Map {
    private int x;
    private int y;

    public Map(String mapFile, int x, int y) {
        this.x = x;
        this.y = y;
        int[][] gameMap = new int[x][y];
    }
}
