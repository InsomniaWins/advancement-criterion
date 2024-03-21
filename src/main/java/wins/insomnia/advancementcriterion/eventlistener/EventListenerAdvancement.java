package wins.insomnia.advancementcriterion.eventlistener;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wins.insomnia.advancementcriterion.AdvancementCriterion;
import wins.insomnia.advancementcriterion.register.RegisterScoreCriteria;

@Mod.EventBusSubscriber(modid = AdvancementCriterion.MODID)
public class EventListenerAdvancement {

    @SubscribeEvent
    public static void playerGotAdvancement(AdvancementEvent event) {

        if (event.getEntityPlayer() instanceof EntityPlayerMP) {

            if (!event.getAdvancement().getId().getPath().contains("recipes/")) {

                EntityPlayerMP serverPlayer = (EntityPlayerMP) event.getEntityPlayer();

                for (ScoreObjective scoreobjective : serverPlayer.world.getScoreboard().getObjectivesFromCriteria(RegisterScoreCriteria.ADVANCEMENT)) {
                    Score score = serverPlayer.getWorldScoreboard().getOrCreateScore(serverPlayer.getName(), scoreobjective);
                    score.incrementScore();
                }

            }
        }

    }
}
