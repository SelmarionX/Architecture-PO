package rewards.shoe;

import classes.IGameItem;
import classes.ItemGenerator;

public class ShoeFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Shoe();
    }
}