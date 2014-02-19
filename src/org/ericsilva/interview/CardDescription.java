package org.ericsilva.interview;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The Card description represents all of the cards within the system.
 * 
 * @author FARRELJ3
 */
public class CardDescription {

    // =========================================================================
    // Static Attributes
    // =========================================================================

    // =========================================================================
    // Static Methods
    // =========================================================================

    /**
     * Return an Iterator that will list all of the suits.
     * 
     * @return an Iterator of the suits.
     */
    public static Iterator listAllCardDescriptions() {
        ArrayList list = new ArrayList();
        list.add(TWO);
        list.add(THREE);
        list.add(FOUR);
        list.add(FIVE);
        list.add(SIX);
        list.add(SEVEN);
        list.add(EIGHT);
        list.add(NINE);
        list.add(TEN);
        list.add(JACK);
        list.add(QUEEN);
        list.add(KING);
        list.add(ACE);
        return list.iterator();
    }

    // =========================================================================
    // Static Classes
    // =========================================================================

    /**
     * The two card.
     */
    public static final CardDescription TWO = new CardDescription("two", "2", 1);

    /**
     * The three card.
     */
    public static final CardDescription THREE = new CardDescription(
        "three",
        "3",
        2);

    /**
     * The four card.
     */
    public static final CardDescription FOUR = new CardDescription(
        "four",
        "4",
        3);

    /**
     * The five card.
     */
    public static final CardDescription FIVE = new CardDescription(
        "five",
        "5",
        4);

    /**
     * The six card.
     */
    public static final CardDescription SIX = new CardDescription("six", "6", 5);

    /**
     * The seven card.
     */
    public static final CardDescription SEVEN = new CardDescription(
        "seven",
        "7",
        6);

    /**
     * The eight card.
     */
    public static final CardDescription EIGHT = new CardDescription(
        "eight",
        "8",
        7);

    /**
     * The nine card.
     */
    public static final CardDescription NINE = new CardDescription(
        "nine",
        "9",
        8);

    /**
     * The ten card.
     */
    public static final CardDescription TEN = new CardDescription(
        "ten",
        "10",
        9);

    /**
     * The jack card.
     */
    public static final CardDescription JACK = new CardDescription(
        "jack",
        "J",
        10);

    /**
     * The queen card.
     */
    public static final CardDescription QUEEN = new CardDescription(
        "queen",
        "Q",
        11);

    /**
     * The king card.
     */
    public static final CardDescription KING = new CardDescription(
        "king",
        "K",
        12);

    /**
     * The ace card.
     */
    public static final CardDescription ACE = new CardDescription(
        "ace",
        "A",
        13);

    // =========================================================================
    // Attributes
    // =========================================================================

    /**
     * The String name of a card.
     */
    private String name;

    /**
     * The single character that is displayed to represent this card. 2 is
     * displayed for a 2. K is displayed for a King.
     */
    private String display;

    /**
     * The numeric value of this card. This will be used with a suit to
     * determine the winner of a game.
     */
    private int rank;

    // =========================================================================
    // Constructors
    // =========================================================================

    /**
     * The full constructor for the card descriptions.
     * 
     * @param name
     *            the name of this card.
     * @param display
     *            the display for this card.
     * @param rank
     *            the rank of this card.
     */
    private CardDescription(String name, String display, int rank) {
        super();
        this.name = name;
        this.display = display;
        this.rank = rank;
    }

    // =========================================================================
    // Methods
    // =========================================================================

    /**
     * The display string for this card.
     * 
     * @return the display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * The display string for this card.
     * 
     * @param display
     *            the display to set
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @param rank
     *            the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    // =========================================================================
    // Inner classes
    // =========================================================================

}
