package B_OOP.OOP4;

public class Card {

    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)

    // two-argument constructor initializes card's face and suit
    // providing only one constructor with 2 arguments forces the creation of card to always
    // have a face and a suit
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    }
}
