package rewards.silver;

import classes.IGameItem;

public class Silver implements IGameItem {
    @Override
    public void open() {
        System.out.println("Серебро");
    }
}