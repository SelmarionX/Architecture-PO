package rewards.gem;

import classes.IGameItem;
import classes.ItemGenerator;

public class GemFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}