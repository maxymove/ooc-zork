package game;

public class Monster {
    /*
     * Monster should have HP, HPMax, attack power, location(row, col),
     */

    private int hp;
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
