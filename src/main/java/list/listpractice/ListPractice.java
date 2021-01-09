package list.listpractice;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class ListPractice extends JavaPlugin {

    private List<String> list;

    @Override
    public void onEnable() {
        // Plugin startup logic
        list = new ArrayList<>();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public  boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("mlist")){
            if (args[0].equals("a")) {
                if (args.length != 2) {
                    sender.sendMessage("引数が足りません");
                    return true;
                }
                list.add(args[1]);
                //listに文字を追加
            }
            if (args[0].equals("s")) {
                for (String s : list) sender.sendMessage(s);
                    //listに保存されている文字を表示
                }
            }
            if (args[0].equals("d")) {
                list.removeAll(list);
                return true;
            }
            return false;
    }
}

