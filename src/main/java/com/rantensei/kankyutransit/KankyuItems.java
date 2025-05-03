package com.rantensei.kankyutransit;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class KankyuItems {
    private static final CreateRegistrate REGISTRATE = KankyuTransit.registrate();

    static {
        REGISTRATE.setCreativeTab(AllCreativeModeTabs.BASE_CREATIVE_TAB);
    }

    public static final ItemEntry<Item> TEST_ITEM =
            REGISTRATE.item("test_item", Item::new)
                    .register();

    public static void register() {

    }
}
