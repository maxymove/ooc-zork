package game;

import monster.Monster;
import item.Item;

public class Room {
    private int row, col;
    private boolean[] connected = {false, false, false, false}; // N, E, S, W
    private Monster monster;
    private Item item;

    public Room(boolean[] door) {
        this.connected = door;
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

    public boolean[] getConnected() {
        return connected;
    }

    public void setConnected(boolean[] connected) {
        this.connected = connected;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
