package rewards.coin;

import classes.IGameItem;

public class Coin implements IGameItem {
    @Override
    public void open() {
        System.out.println("Монета");
    }
}