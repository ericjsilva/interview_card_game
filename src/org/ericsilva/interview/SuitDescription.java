package org.ericsilva.interview;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Enumeration of the suit class represents the suit value of a card. Examples
 * or suits are Heart, Diamond, Club and Spade.
 * 
 * Each suit has a rank that will determine the winner of games. The higher the
 * Rank, the better.
 * 
 * @author FARRELJ3
 */
public final class SuitDescription {

    // =========================================================================
    // Static Attributes
    // =========================================================================

    /**
     * The heart suit.
     */
    public static final SuitDescription HEART = new SuitDescription(
        "Heart",
        'H',
        4,
        "Red");

    /**
     * The Diamond suit.
     */
    public static final SuitDescription DIAMOND = new SuitDescription(
        "Diamond",
        'D',
        3,
        "Red");

    /**
     * The Club Suit.
     */
    public static final SuitDescription CLUB = new SuitDescription(
        "Club",
        'C',
        2,
        "Black");

    /**
     * The Spade Suit.
     */
    public static final SuitDescription SPADE = new SuitDescription(
        "Spade",
        'S',
        1,
        "Black");

    // =========================================================================
    // Static Methods
    // =========================================================================

    /**
     * Return an Iterator that will list all of the suits.
     * 
     * @return an Iterator of the suits.
     */
    public static Iterator listAllSuitDescriptions() {
        ArrayList list = new ArrayList();
        list.add(HEART);
        list.add(DIAMOND);
        list.add(CLUB);
        list.add(SPADE);
        return list.iterator();
    }

    // =========================================================================
    // Static Classes
    // =========================================================================

    // =========================================================================
    // Attributes
    // =========================================================================

    /**
     * The String name of a suit.
     */
    private String name;

    /**
     * The single character that is displayed to represent this card. 2 is
     * displayed for a 2. K is displayed for a King.
     */
    private char display;

    /**
     * The numeric rank of a suit.
     */
    private int rank;

    /**
     * The color of this suit.
     */
    private String color;

    // =========================================================================
    // Constructors
    // =========================================================================

    /**
     * Private constructor for a suit.
     * 
     * @param name
     *            the name of this suit.
     * @param display
     *            the display character for this suit.
     * @param rank
     *            the numeric value of the suit.
     * @param color
     *            the color of this suit.
     */
    private SuitDescription(String name, char display, int rank, String color) {
        super();
        this.name = name;
        this.display = display;
        this.rank = rank;
        this.color = color;
    }

    // =========================================================================
    // Methods
    // =========================================================================

    /**
     * Get the display character for this card.
     * 
     * @return the display for this card.
     */
    public char getDisplay() {
        return display;
    }

    /**
     * Set the display character for this card.
     * 
     * @param display
     */
    public void setDisplay(char display) {
        this.display = display;
    }

    /**
     * Get the name of this suit.
     * 
     * @return the name of this suit.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this suit.
     * 
     * @param name
     *            the name of this suit.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the rank of this suit.
     * 
     * @return the rank of this suit.
     */
    public int getRank() {
        return rank;
    }

    /**
     * Set the rank of this suit.
     * 
     * @param rank
     *            integer value of the rank of this suit.
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Return the color of this card.
     * 
     * @return the color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the color of this card.
     * 
     * @param color
     *            the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    // =========================================================================
    // Inner classes
    // =========================================================================

}
