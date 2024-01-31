package vb.$speeddiamond;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		try {
			((org.bukkit.command.CommandSender) (Object) ((org.bukkit.command.ConsoleCommandSender) org.bukkit.Bukkit
					.getConsoleSender())).sendMessage("[SpeedDiamond] starting..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event1(org.bukkit.event.block.BlockBreakEvent event) throws Exception {
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DEEPSLATE_DIAMOND_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(((int) (60d)), ((int) (2d)))));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DIAMOND_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(((int) (60d)), ((int) (2d)))));
		}
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
