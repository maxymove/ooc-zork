package item;

public class ItemFactory {

    public Item createItem(String itemType) {
        if ("ARROW".equalsIgnoreCase(itemType)) {
            return new Arrow();
        } else if ("DAGGER".equalsIgnoreCase(itemType)) {
            return new Dagger();
        } else if ("EXCALIBUR".equalsIgnoreCase(itemType)) {
            return new Excalibur();
        }
        return null;
    }
}
