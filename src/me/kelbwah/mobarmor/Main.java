package me.kelbwah.mobarmor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable()
	{
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable() {}
	
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent creature)
	{
		ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
		
		
		if(creature.getEntityType() == EntityType.ZOMBIE)
		{
			Zombie thisZombie = (Zombie) creature.getEntity();
				
			thisZombie.getEquipment().setHelmet(helmet);
			thisZombie.getEquipment().setBoots(boots);
			thisZombie.getEquipment().setLeggings(leggings);
			thisZombie.getEquipment().setChestplate(chestplate);
		}
		
		if(creature.getEntityType() == EntityType.SKELETON)
		{
			Skeleton thisSkeleton = (Skeleton) creature.getEntity();
				
			thisSkeleton.getEquipment().setHelmet(helmet);
			thisSkeleton.getEquipment().setBoots(boots);
			thisSkeleton.getEquipment().setChestplate(chestplate);
			thisSkeleton.getEquipment().setLeggings(leggings);
		}
	}

}
