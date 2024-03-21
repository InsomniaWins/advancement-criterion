package wins.insomnia.advancementcriterion;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import wins.insomnia.advancementcriterion.register.RegisterScoreCriteria;

@Mod(modid = AdvancementCriterion.MODID, name = AdvancementCriterion.NAME, version = AdvancementCriterion.VERSION)
public class AdvancementCriterion {
    public static final String MODID = "advancementcriterion";
    public static final String NAME = "Advancement Criterion";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {

        RegisterScoreCriteria.register();

    }
}
