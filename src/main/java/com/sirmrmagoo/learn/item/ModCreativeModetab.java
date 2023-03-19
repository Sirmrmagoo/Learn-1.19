package com.sirmrmagoo.learn.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModetab {
    public static final CreativeModeTab MOD = new CreativeModeTab("mod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}
