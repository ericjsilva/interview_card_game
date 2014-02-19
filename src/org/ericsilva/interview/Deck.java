package org.ericsilva.interview;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The deck of cards for this game.
 * 
 * The deck will hold all of the cards for the game and is responsible for
 * shuffling. As a game is played, cards will be removed from the Deck.
 * 
 * @author FARRELJ3
 * @stereotype moment-interval
 */
public class Deck implements IDeck {

    // =========================================================================
    // Static Attributes
    // =========================================================================

    // =========================================================================
    // Static Methods
    // =========================================================================

    // =========================================================================
    // Static Classes
    // =========================================================================

    // =========================================================================
    // Attributes
    // =========================================================================

    /**
     * The list of cards that are remaining in the deck. As the game is played,
     * cards are removed from the deck.
     * 
     * @associates com.wyeth.interview.Card
     * @clientCardinality -
     * @supplierCardinality 1
     */
    private ArrayList cards;

    // =========================================================================
    // Constructors
    // =========================================================================

    // =========================================================================
    // Methods
    // =========================================================================

    /**
     * Constructor for the deck.
     * 
     * This constructor will construct the deck with 52 playing cards. There are
     * 4 suits each with 13 cards to create the deck.
     */
    public Deck() {
        cards = new ArrayList();
        // TODO: 1.  Create the cards needed for this game.
    }

    /**
     * Deal a card off of the deck.
     */
    public Card dealCard() {
        return (Card) cards.remove(0);
    }

    /**
     * Shuffle this deck of cards.
     */
    public void shuffle() {
        // TODO: 2.  Shuffle the deck.
    }

    /**
     * Return the string representation of this deck of cards.
     * 
     * @return the string representation of this deck.
     */
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (Iterator iter = cards.iterator(); iter.hasNext();) {
            Card card = (Card) iter.next();
            str.append(card.toString() + " ");
        }
        return str.toString();
    }

    // =========================================================================
    // Inner classes
    // =========================================================================

}
