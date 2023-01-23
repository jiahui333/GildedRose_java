package com.alexaitken.gildedrose.items;

public class AgedBrie implements UpdateQuality {

    private Item item;
    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.getQuality() <= 49) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

}
