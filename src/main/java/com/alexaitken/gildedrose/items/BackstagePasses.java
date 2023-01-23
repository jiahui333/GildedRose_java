package com.alexaitken.gildedrose.items;

public class BackstagePasses implements UpdateQuality {

    private Item item;
    public BackstagePasses(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        } else if (item.getSellIn() > 10 && item.getQuality() <= 49) {
            item.setQuality(item.getQuality() + 1);
        } else if (item.getSellIn() <= 5 && item.getQuality() <= 47) {
            item.setQuality(item.getQuality() + 3);
        } else if (item.getSellIn() <= 5) {
            item.setQuality(50);
        }
        else if (item.getSellIn() <= 10 && item.getQuality() <= 48) {
            item.setQuality(item.getQuality() + 2);
        } else if (item.getSellIn() <= 10) {
            item.setQuality(50);
        }

        item.setSellIn(item.getSellIn() - 1);
    }
}

