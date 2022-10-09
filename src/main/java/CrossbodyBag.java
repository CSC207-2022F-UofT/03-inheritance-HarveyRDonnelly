/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag {

    private int numberOfStraps;

    /**
     * Creates a new CrossbodyBag with the given color, capacity and the number of
     * straps.
     *
     * @param color the color of this bag instance.
     * @param capacity the capacity of this bag instance.
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        /**
         * This is how we call the parent's constructor
         * The Python equivalent is super().__init__(...)
         */
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    /**
     * Gets the number of straps of this Bag instance.
     *
     * @return an int representing the number of straps of this Bag instance.
     */
    public int getNumberOfStraps() {
        return this.numberOfStraps;
    }

    /**
     * Return the details of this Bag.
     *
     * @return a String object representing the details of this Bag instance.
     */
    @Override
    public String toString() {
        return this.getColor() + " Crossbody Bag with " + this.numberOfStraps
                + " straps (" + this.getNumberOfContents() + " / " +
                this.getCapacity() + ")";
    }

    /**
     * Increase the capacity of this bag by 2.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

}