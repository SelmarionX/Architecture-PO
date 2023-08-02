package rewards.ruby;

import classes.IGameItem;
import classes.ItemGenerator;

public class RubyFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}