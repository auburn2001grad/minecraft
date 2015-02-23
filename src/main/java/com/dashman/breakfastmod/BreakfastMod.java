package com.dashman.breakfastmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = BreakfastMod.MODID, version = BreakfastMod.VERSION)
public class BreakfastMod
{
	public static final String MODID = "dashman.breakfastmod";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		addRecipes();

		DungeonHooks.addDungeonMob("Endermen", 300);
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(Items.diamond_chestplate), 25, 50, 1));
	}

	private void addRecipes(){
		GameRegistry.addRecipe(new ItemStack(Items.poisonous_potato),
				"XXX",
				"XYX",
				"XXX",
				'X', Items.wheat, 'Y', Items.sugar);

		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				"xxx",
				" y ",
				" z ",
				'x', Items.leather, 'y', Items.string, 'z', Items.iron_ingot);

		GameRegistry.addShapelessRecipe(new ItemStack(Items.saddle),
				Items.leather, Items.leather, Items.leather, Items.string, Items.iron_ingot);

		GameRegistry.addShapelessRecipe(new ItemStack( Items.diamond_chestplate),
				Items.leather_chestplate, Items.poisonous_potato);

		GameRegistry.addRecipe(new ItemStack(Items.command_block_minecart),
				"XYX",
				"ZAZ",
				"BZB",
				'X', Items.diamond, 'Y', Blocks.emerald_block, 'Z', Items.emerald, 'A', Blocks.diamond_block, 'B', Items.leather);

		GameRegistry.addRecipe(new ItemStack(Items.diamond_sword),
				" X ",
				" X ",
				" Y ",
				'X', Blocks.dirt, 'Y', Items.stick);
	}
}
