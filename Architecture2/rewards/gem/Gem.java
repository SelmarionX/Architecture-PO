package rewards.gem;

import classes.IGameItem;

/**
 * Класс брилианта
 */
public class Gem implements IGameItem {
    @Override
    public void open() {
        System.out.println("Брилиант");
    }
}