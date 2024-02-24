package vb.$speedore;
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
		saveDefaultConfig();
		try {
			((org.bukkit.command.CommandSender) (Object) ((org.bukkit.command.ConsoleCommandSender) org.bukkit.Bukkit
					.getConsoleSender())).sendMessage(
							"[SpeedOre] \u0417\u0430\u043F\u0443\u0441\u043A\u0430\u0435\u0442\u0441\u044F..");
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
				((org.bukkit.Material) org.bukkit.Material.COAL_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Coal_Ore_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Coal_Ore_Amplifier")).intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DEEPSLATE_COAL_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Coal_Ore_Duration"))
																	.intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Coal_Ore_Amplifier"))
																	.intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.COPPER_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Copper_Ore_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Copper_Ore_Amplifier")).intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DEEPSLATE_COPPER_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Copper_Ore_Duration"))
																	.intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Copper_Ore_Amplifier"))
																	.intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.AMETHYST_BLOCK))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Amethyst_Block_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Amethyst_Block_Amplifier"))
																	.intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.IRON_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Iron_Ore_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Iron_Ore_Amplifier")).intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DEEPSLATE_IRON_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Iron_Ore_Duration"))
																	.intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Iron_Ore_Amplifier"))
																	.intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.GOLD_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Gold_Ore_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Gold_Ore_Amplifier")).intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DEEPSLATE_GOLD_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Gold_Ore_Duration"))
																	.intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Gold_Ore_Amplifier"))
																	.intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.NETHER_GOLD_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Nether_Gold_Ore_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Nether_Gold_Ore_Amplifier"))
																	.intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DIAMOND_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Diamond_Ore_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Diamond_Ore_Amplifier")).intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.DEEPSLATE_DIAMOND_ORE))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Diamond_Ore_Duration"))
																	.intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Deepslate_Diamond_Ore_Amplifier"))
																	.intValue())));
		}
		if (PluginMain.checkEquals(
				((org.bukkit.Material) ((org.bukkit.block.data.BlockData) ((org.bukkit.block.Block) event.getBlock())
						.getBlockData()).getMaterial()),
				((org.bukkit.Material) org.bukkit.Material.ANCIENT_DEBRIS))) {
			((org.bukkit.entity.LivingEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).addPotionEffect(
					((org.bukkit.potion.PotionEffect) ((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SPEED)
							.createEffect(
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Ancient_Debris_Duration")).intValue(),
									((Number) ((org.bukkit.configuration.ConfigurationSection) (Object) org.bukkit.configuration.file.YamlConfiguration
											.loadConfiguration(
													new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
															"config.yml"))).get("Ancient_Debris_Amplifier"))
																	.intValue())));
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
