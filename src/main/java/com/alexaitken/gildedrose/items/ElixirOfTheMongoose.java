package com.alexaitken.gildedrose.items;

public class ElixirOfTheMongoose extends Item implements UpdateQuality{
    public ElixirOfTheMongoose(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        setQuality(getQuality() - 1);
    }
}
