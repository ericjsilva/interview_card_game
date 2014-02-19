package org.ericsilva.interview;

/**
 * Implementation of a player in the game.
 * 
 * @author FARRELJ3
 * @stereotype party
 */
public class Player {

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
     * The name of a player.
     */
    private String name;

    /**
     * This players card.
     * @clientCardinality -
     * @supplierCardinality 1
     */
    private Card card;

    // =========================================================================
    // Constructors
    // =========================================================================

    /**
     * Full constructor for creating a player.
     * 
     * @param name
     *            the name of the player.
     */
    public Player(String name) {
        this.name = name;
    }

    // =========================================================================
    // Methods
    // =========================================================================

    /**
     * Returns the name of a player.
     * 
     * @return the name of this player.
     */
    public final String getName() {
        return name;
    }

    /**
     * Return this players card.
     * 
     * @return this players card.
     */
    public final Card getCard() throws IllegalStateException {
        return card;
    }

    /**
     * Set this players card.
     * 
     * @param card
     *            this players card.
     */
    public void setCard(Card card) throws IllegalStateException {
        if (this.card != null) {
            throw new IllegalStateException(
                "Player has already been assigned a card.");
        }
        this.card = card;
    }

    /**
     * Return this player as a string.
     * 
     * @return string representation of this object.
     */
    public final String toString() {
        return this.name + " " + this.card.toString();
    }

    // =========================================================================
    // Inner classes
    // =========================================================================

}
