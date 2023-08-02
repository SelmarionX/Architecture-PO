package rewards.sapphire;

import classes.IGameItem;
import classes.ItemGenerator;

public class SapphireFactory extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}