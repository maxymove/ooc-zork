package game;

public class Player {
    /*
     * Player should have HP, HPMax, attack power, item, location(row, col)
     */

    // Array of items vs Map of items ???
    // use Coordinate or Location Class instead of row and col ???
    // Both Player and Monster share same attributes, make an interface ???

    private final int hpMax = 100;
    private int hp = 100;
    private int atkPower;
    private int row, col;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtkPower() {
        return atkPower;
    }

    public void setAtkPower(int atkPower) {
        this.atkPower = atkPower;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
