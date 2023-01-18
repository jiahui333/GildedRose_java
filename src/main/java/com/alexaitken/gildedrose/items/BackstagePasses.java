package com.alexaitken.gildedrose.items;

public class BackstagePasses extends Item implements UpdateQuality{
    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getQuality() < 50) {
            if (getSellIn() <= 5) {
                setQuality(getQuality() + 3);
            } else if (getSellIn() <= 10) {
                setQuality(getQuality() + 2);
            }
        }
    }
}

