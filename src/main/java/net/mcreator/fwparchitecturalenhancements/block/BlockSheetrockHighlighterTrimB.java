
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
public class BlockSheetrockHighlighterTrimB extends ElementsFwparchitecturalenhancementsMod.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:sheetrockhighlightertrimb")
	public static final Block block = null;
	public BlockSheetrockHighlighterTrimB(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 118);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sheetrockhighlightertrimb"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:sheetrockhighlightertrimb", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("sheetrockhighlightertrimb");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("pickaxe", 0);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabArchitecturalEnhancements.tab);
		}
	}
}
