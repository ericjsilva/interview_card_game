package org.ericsilva.interview;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This is the main class for the shuffler program. The shuffler is a simple
 * program that will create a set of players and a deck of cards. It will then
 * deal a single card to each player, and determine a winner.
 * 
 * The winner of this game is the one with the highest card dealt to him.
 * 
 * @author FARRELJ3
 */
public class Shuffler {

    // =========================================================================
    // Static Attributes
    // =========================================================================

    // =========================================================================
    // Static Methods
    // =========================================================================

    /**
     * Main method of the system. This method will play the game.
     * 
     * @param args
     *            the command line arguments. None are expected.
     */
    public static void main(final String[] args) {
        Shuffler shuffler = new Shuffler();
        shuffler.play();
    }

    // =========================================================================
    // Static Classes
    // =========================================================================

    // =========================================================================
    // Attributes
    // =========================================================================

    /**
     * The deck that we will use to play the game with.
     */
    private IDeck deck;

    /**
     * The players that will play our game.
     * 
     * @associates com.wyeth.interview.Player
     */
    private ArrayList players;

    // =========================================================================
    // Constructors
    // =========================================================================

    // =========================================================================
    // Methods
    // =========================================================================

    /**
     * Play the game. This method will create the deck and players, then deal
     * cards to each player and finally evaluate the winner.
     */
    public void play() {
        // Create a deck.
        deck = new Deck();
        System.out.println(deck.toString());
        deck.shuffle();
        System.out.println(deck.toString());

        // Create some players.
        players = createPlayers();

        // Deal one card to each player.
        for (Iterator iter = players.iterator(); iter.hasNext();) {
            Player player = (Player) iter.next();
            player.setCard(deck.dealCard());
        }

        Player winner = determineWinner();
        System.out.println("The winner is " + winner);
    }

    /**
     * Determine the winner of this game.
     * 
     * @param players
     *            the players that have played.
     * @return the player who has the highest card.
     */
    private Player determineWinner() {
        // TODO: 3.  Determine the winner.
        return (Player) this.players.get(0);
    }

    /**
     * This method will return a table full of players for the game.
     * 
     * @return the table of players.
     */
    private ArrayList createPlayers() {
        ArrayList players = new ArrayList();
        Player jim = new Player("Jim");
        players.add(jim);
        players.add((Player) new Player("Joe"));
        players.add((Player) new Player("Bill"));
        return players;
    }

    // =========================================================================
    // Inner classes
    // =========================================================================

}
