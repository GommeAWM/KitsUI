package from.nukkit;

import cn.nukkit.plugin.PluginBase;

public class KitsUI extends PluginBase {

    public KitsUI kitsUI;

    @Override
    public void onEnable() {
        kitsUI = this;
        this.getLogger().info("§fEnable: §a§lKitsUI");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("§fDisable: §c§lKitsUI");
    }



}
