package from.nukkit.Listener;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import from.nukkit.KitsUI;

public class PlayerResponseListener implements Listener {

    public KitsUI kitsUI;

    public PlayerResponseListener(KitsUI kitsUI){
        this.kitsUI = kitsUI;
    }

    @EventHandler
    public void playerResponse(PlayerFormRespondedEvent)

}
