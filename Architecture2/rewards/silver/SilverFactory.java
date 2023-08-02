package rewards.silver;

import classes.IGameItem;
import classes.ItemGenerator;

public class SilverFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}