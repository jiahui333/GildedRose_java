package com.alexaitken.gildedrose.items;

public class ItemFactory {
    public static UpdateQuality createNewItem (String name, int sellIn, int quality) throws RuntimeException{
        try {
            if (name.contains("Aged Brie")) {
                return new AgedBrie(name, sellIn, quality);
            } else if (name.contains("Backstage passes")) {
                return new BackstagePasses(name, sellIn, quality);
            } else if (name.contains("Elixir of the Mongoose")) {
                return new ElixirOfTheMongoose(name, sellIn, quality);
            } else if (name.contains("Conjured Mana Cake")) {
                return new ConjuredManaCake(name, sellIn, quality);
            } else if (name.contains("Dexterity Vest")) {
                return new DexterityVest(name, sellIn, quality);
            } else if (name.contains("Sulfuras")) {
                return new Sulfuras(name, sellIn, quality);
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("The name does not belong to any category");
        }
        return null;
    }
}
