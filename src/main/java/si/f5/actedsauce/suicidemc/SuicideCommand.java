package si.f5.actedsauce.suicidemc;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("suicide")) {
            if(!(commandSender instanceof Player)) {
                return false;
            }
            Player player = (Player)commandSender;
            final GameMode gamemode = player.getGameMode();
            player.setGameMode(GameMode.ADVENTURE);
            player.damage(1000000000);
            player.setGameMode(gamemode);
            return true;
        }
        return false;
    }
}
