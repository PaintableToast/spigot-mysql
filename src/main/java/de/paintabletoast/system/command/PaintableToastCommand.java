package de.paintabletoast.system.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class PaintableToastCommand implements CommandHandler {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("&eSystem &8» &fDieses System wurde von &bPaintableToast &fverfasst!%ENTER%&eSystem &8» &fDas Netzwerk: &bIP &fdarf dieses Plugin verwenden!");
        return false;
    }
}
