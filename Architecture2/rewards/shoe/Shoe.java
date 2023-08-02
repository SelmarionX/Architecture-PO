package rewards.shoe;

import classes.IGameItem;

public class Shoe implements IGameItem {
    @Override
    public void open() {
        System.out.println("Старый башмак");
    }
}