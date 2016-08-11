import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Card.Suit.SPADES, Card.Face.ACE));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.ACE));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.TWO));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.THREE));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.FOUR));
        System.out.println(RummyUtils.isSequenceOfNCards(cards, 5));
    }
}
