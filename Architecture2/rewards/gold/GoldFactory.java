package rewards.gold;

import classes.IGameItem;
import classes.ItemGenerator;

/**
 * Фабрика создания золота
 */
public class GoldFactory extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}