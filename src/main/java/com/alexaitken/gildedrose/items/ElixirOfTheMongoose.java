package com.alexaitken.gildedrose.items;

public class ElixirOfTheMongoose implements UpdateQuality{
    private Item item;
    public ElixirOfTheMongoose(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.getQuality() >= 1) {
            item.setQuality(item.getQuality() - 1);
        }

        item.setSellIn(item.getSellIn() - 1);
    }
}
