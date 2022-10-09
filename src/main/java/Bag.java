/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.ArrayList;

public abstract class Bag {

    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;

    /**
     * Creates a new Bag object.
     * This constructor takes in a String object representing the bag color and an
     * int primitive representing the bag capacity.
     *
     * @param bagColor the color of this Bag instance.
     * @param bagCapacity the capacity of this Bag instance.
     */
    public Bag(String bagColor, int bagCapacity) {
        this.color = bagColor;
        this.capacity = bagCapacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }

    /**
     * Gets the color of this Bag instance.
     *
     * @return a String object representing the color of this Bag instance.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Gets the number of contents of this Bag instance.
     *
     * @return an int representing the number of contents of this Bag instance.
     */
    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    /**
     * Gets the capacity of this Bag instance.
     *
     * @return an int representing the capacity of this Bag instance.
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Sets the color of this Bag instance to newColor.
     *
     * @param newColor a String object representing a color.
     */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /**
     * Takes in a String representing an item in the Bag. The item is added into the Bag
     * if the number of items in the bag is < the capacity of the Bag.
     *
     * @param item a String object representing an item to be placed in the bag if
     *             possible.
     * @return whether the item has successfully been added to the Bag instance.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents[this.numberOfContents] = item;
            this.numberOfContents += 1;
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * If there are no items in this Bag, return null.
     *
     * @return a String object representing the last item added to this bag if there
     *      * is at least one item. If there are no items in the Bag, returns null.
     */

    public String popItem() {
        String lastItem = null;
        if (numberOfContents > 0) {
            lastItem = this.contents[numberOfContents - 1];
            this.contents[numberOfContents - 1] = null;
            this.numberOfContents -= 1;
        }
        return lastItem;
    }



    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;
        String[] newContents = new String[this.capacity];
        for (int i = 0; i < this.numberOfContents; i++) {
            newContents[i] = this.contents[i];
        }
        this.contents = newContents;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return a String object representing the details of this Bag instance.
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}