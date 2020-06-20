package item;

public abstract class Item {
    private String type;
    private int atkPow;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAtkPow() {
        return atkPow;
    }

    public void setAtkPow(int atkPow) {
        this.atkPow = atkPow;
    }
}
