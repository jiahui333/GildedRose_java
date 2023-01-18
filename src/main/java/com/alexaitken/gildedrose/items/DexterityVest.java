package com.alexaitken.gildedrose.items;

public class DexterityVest extends Item implements UpdateQuality{

    public DexterityVest(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getQuality() >= 0) {
            setQuality(getQuality() - 1);
            setSellIn(getSellIn() - 1);
        };
    }
}
