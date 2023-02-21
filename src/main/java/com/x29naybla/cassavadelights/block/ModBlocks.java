package com.x29naybla.cassavadelights.block;

import com.x29naybla.cassavadelights.CassavaDelights;
import com.x29naybla.cassavadelights.item.ModItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CassavaDelights.MOD_ID);


    public static RegistryObject<Block> CASSAVA_CRATE = registerBlock("cassava_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2f)),FarmersDelight.CREATIVE_TAB);

    public static RegistryObject<Block> WILD_CASSAVA = registerBlock("wild_cassava",
            () -> new WildCropBlock(MobEffects.POISON,6,  BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).strength(0f).noCollission()),FarmersDelight.CREATIVE_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
