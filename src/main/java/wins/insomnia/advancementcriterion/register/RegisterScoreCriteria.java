package wins.insomnia.advancementcriterion.register;

import net.minecraft.scoreboard.IScoreCriteria;
import net.minecraft.scoreboard.ScoreCriteria;

public class RegisterScoreCriteria {

    public static IScoreCriteria ADVANCEMENT;

    public static void register() {

        ADVANCEMENT = new ScoreCriteria("advancement");

        System.out.println("ADVANCEMENT: " + IScoreCriteria.INSTANCES.get("advancement"));

    }


}
