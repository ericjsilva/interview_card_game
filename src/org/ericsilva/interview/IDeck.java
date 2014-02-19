package org.ericsilva.interview;

/**
 * The IDeck interface contains the functions that a deck must be able to
 * perform.
 * 
 * The construction of a deck is always the same, there will be a total of 52
 * Cards 2,3,4,5,6,7,8,9,10,J,Q,K,A one card for each of the 4 suits Spade,
 * Club, Heart and Diamond.
 * 
 * @author FARRELJ3
 */
public interface IDeck {

	/**
	 * The shuffle method must mix the order of the cards randomly.
	 */
	void shuffle();

	/**
	 * The deck must be printable.
	 * 
	 * @return a string representation of the entire deck.
	 */
	String toString();

	/**
	 * The dealCard method will return the next card in the deck.
	 * 
	 * Once a card is dealt to a player, it cannot be dealt to any other players
	 * in the game.
	 * 
	 * @return ICard the next card from the deck.
	 */
	Card dealCard();
}
