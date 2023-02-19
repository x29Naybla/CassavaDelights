package com.x29naybla.cassavadelights.item;

import com.x29naybla.cassavadelights.CassavaDelights;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CassavaDelights.MOD_ID);

    public static final RegistryObject<Item> CASSAVA = ITEMS.register("cassava",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CASSAVA)));
    public static final RegistryObject<Item> CUT_CASSAVA = ITEMS.register("cut_cassava",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CUT_CASSAVA)));
    public static final RegistryObject<Item> FRIED_CASSAVA = ITEMS.register("fried_cassava",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.FRIED_CASSAVA)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
