package item;

public class ItemFactoryDemo {

    public static void main(String[] args) {
        ItemFactory itemFactory = new ItemFactory();
        Item item1 = itemFactory.createItem("Excalibur");
        System.out.println(item1.getType());
        System.out.println(item1.getAtkPow());
    }
}
