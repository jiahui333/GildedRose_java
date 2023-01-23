package com.alexaitken.gildedrose.items;

public class ItemFactory {
    public static UpdateQuality createNewItem (Item item) throws RuntimeException{
        try {
            if (item.getName().contains("Aged Brie")) {
                return new AgedBrie(item);
            } else if (item.getName().contains("Backstage passes")) {
                return new BackstagePasses(item);
            } else if (item.getName().contains("Elixir of the Mongoose")) {
                return new ElixirOfTheMongoose(item);
            } else if (item.getName().contains("Conjured Mana Cake")) {
                return new ConjuredManaCake(item);
            } else if (item.getName().contains("Dexterity Vest")) {
                return new DexterityVest(item);
            } else if (item.getName().contains("Sulfuras")) {
                return new Sulfuras(item);
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("The name does not belong to any category");
        }
        return null;
    }
}
