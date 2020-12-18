
package net.mcreator.fwparchitecturalenhancements.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.fwparchitecturalenhancements.creativetab.TabArchitecturalEnhancements;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class BlockSunYellowDashStucco extends ElementsFwparchitecturalenhancementsMod.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:sun_yellow_dash_stucco")
	public static final Block block = null;
	public BlockSunYellowDashStucco(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 869);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sun_yellow_dash_stucco"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:sun_yellow_dash_stucco", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("sun_yellow_dash_stucco");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabArchitecturalEnhancements.tab);
		}
	}
}