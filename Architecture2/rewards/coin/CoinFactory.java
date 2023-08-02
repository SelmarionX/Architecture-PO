package rewards.coin;

import classes.IGameItem;
import classes.ItemGenerator;

public class CoinFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Coin();
    }
}