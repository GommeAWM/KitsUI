package from.nukkit.Command;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.element.ElementButtonImageData;
import cn.nukkit.form.window.FormWindowSimple;

public class KitCommand extends Command {

    public KitCommand(){
        super("kits");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {

        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            if (player.hasPermission("cmd.kitsui")){
                FormWindowSimple formWindowSimple = new FormWindowSimple("KitsUI", "Get a nice kit");
                formWindowSimple.addButton(new ElementButton("Leather", new ElementButtonImageData("path", "textures/misc/leather_kit")));
                formWindowSimple.addButton(new ElementButton("Iron", new ElementButtonImageData("path", "textures/misc/iron_kit")));
                formWindowSimple.addButton(new ElementButton("Gold", new ElementButtonImageData("path", "textures/misc/gold_kit")));
                formWindowSimple.addButton(new ElementButton("Diamond", new ElementButtonImageData("path", "textures/misc/diamond_kit")));
                player.showFormWindow(formWindowSimple);
            }
        }

        return true;
    }
}
