package com.alexaitken.gildedrose.items;

public class AgedBrie extends Item implements UpdateQuality{
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }

}
