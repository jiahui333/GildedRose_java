package com.alexaitken.gildedrose.items;

public class ConjuredManaCake extends Item implements UpdateQuality{
    public ConjuredManaCake(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        setQuality(getQuality() - 1);
    }
}
