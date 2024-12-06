import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandHandling extends JavaPlugin {
    static void serverHealth(String consoleCommand) {
        System.out.println("Server status request received: " + consoleCommand);
    }

    static void connectionHealth(String consoleCommand) {
        System.out.println("Player health request received: " + consoleCommand);
    }

    class GameBasedCommands {
        public void protectStructure() {
            System.out.println("Structure protection activated!");
        }
    }

    class PlayerCommands {
        public void handlePlayerCommand(String command) {
            System.out.println("Player command received: " + command);
        }
    }

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled!");

        serverHealth("Check server health");
        connectionHealth("Check player health");

        GameBasedCommands gameCommands = new GameBasedCommands();
        gameCommands.protectStructure();

        PlayerCommands playerCommands = new PlayerCommands();
        playerCommands.handlePlayerCommand("Example command");
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled!");
    }
}