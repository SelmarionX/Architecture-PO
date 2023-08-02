package rewards.gold;

import classes.IGameItem;

public class Gold implements IGameItem {

    @Override
    public void open() {
        System.out.println("Золото");
    }
}