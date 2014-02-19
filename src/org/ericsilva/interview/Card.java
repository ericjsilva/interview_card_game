/* Copyright 2006-2007 Wyeth. All Rights Reserved. */
package org.ericsilva.interview;

/**
 * A card represents a single card in a deck. Each card will have a suit and a
 * face value. The suit is one of four shapes, heart, diamond, club or spade.
 * The face value of the card is a character consisting of
 * 2,3,4,5,6,7,8,9,10,J,Q,K,A.
 * 
 * Cards have a natural sort order consisting first of the suit of the card,
 * then the face value. So a 3 is always better then a 2. And a 2 of hearts is
 * better then a 2 of diamonds.
 * 
 * @stereotype description
 */
public class Card {

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
     * The suit of this card.
     * 
     * @clientCardinality -
     * @supplierCardinality 1
     */
    private SuitDescription suit;

    /**
     * The card value of this card.
     * 
     * @clientCardinality -
     * @supplierCardinality 1
     */
    private CardDescription card;

    // =========================================================================
    // Constructors
    // =========================================================================

    /**
     * Full constructor for creating cards.
     * 
     * @param suit
     *            the suit of this card.
     * @param card
     *            the face of this card.
     */
    public Card(SuitDescription suit, CardDescription card) {
        super();
        this.suit = suit;
        this.card = card;
    }

    // =========================================================================
    // Methods
    // =========================================================================

    /**
     * The card description for this card.
     * 
     * @return the card
     */
    public CardDescription getCard() {
        return card;
    }

    /**
     * Set the card description for this card.
     * 
     * @param card
     *            the card to set
     */
    public void setCard(CardDescription card) {
        this.card = card;
    }

    /**
     * Get the suit description for this card.
     * 
     * @return the suit
     */
    public SuitDescription getSuit() {
        return suit;
    }

    /**
     * Set the suit description for this card.
     * 
     * @param suit
     *            the suit to set
     */
    public void setSuit(SuitDescription suit) {
        this.suit = suit;
    }

    /**
     * Return a String description of this card. The string will have the face
     * and suit of the card.
     * 
     * @return the string description of this card.
     */
    public String toString() {
        return this.card.getDisplay() + this.getSuit().getDisplay();
    }

    // =========================================================================
    // Inner classes
    // =========================================================================

}
