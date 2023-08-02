import classes.ItemGenerator;
import rewards.coin.CoinFactory;
import rewards.gem.GemFactory;
import rewards.gold.GoldFactory;
import rewards.ruby.RubyFactory;
import rewards.sapphire.SapphireFactory;
import rewards.shoe.ShoeFactory;
import rewards.silver.SilverFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ItemGenerator goldFactory = new GoldFactory();
        ItemGenerator gemFactory = new GemFactory();
        ItemGenerator coinFactory = new CoinFactory();
        ItemGenerator silverFactory = new SilverFactory();
        ItemGenerator rubyFactory = new RubyFactory();
        ItemGenerator sapphireFactory = new SapphireFactory();
        ItemGenerator shoeFactory = new ShoeFactory();


        List<ItemGenerator> fabricList = new ArrayList<>(
                Arrays.asList(goldFactory,
                        gemFactory,
                        coinFactory,
                        silverFactory,
                        rubyFactory,
                        sapphireFactory,
                        shoeFactory));

        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}