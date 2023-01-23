package com.alexaitken.gildedrose.items;

public class ConjuredManaCake implements UpdateQuality{
    private Item item;
    public ConjuredManaCake(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 2);
        } else if (item.getQuality() >= 1) {
            item.setQuality(item.getQuality() - 1);
        }

        item.setSellIn(item.getSellIn() - 1);
    }
}
