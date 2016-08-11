import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Card.Suit.SPADES, Card.Face.SIX));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.FOUR));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.THREE));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.FIVE));
        List<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(Card.Suit.SPADES, Card.Face.FIVE));
        cards2.add(new Card(Card.Suit.SPADES, Card.Face.SIX));
        cards2.add(new Card(Card.Suit.SPADES, Card.Face.SEVEN));
        cards2.add(new Card(Card.Suit.SPADES, Card.Face.FOUR));
        cards = SequenceGenerationUtil.generateSequenceRetainingCard(cards, 2);
        System.out.println(RummyUtils.isSequenceOfNCards(cards, 4));
        System.out.println(RummyUtils.cardsToSwap(cards, cards2).size());
        List<Card> cards3 = new ArrayList<>();
        cards3.add(new Card(Card.Suit.SPADES, Card.Face.ACE));
        cards3.add(new Card(Card.Suit.SPADES, Card.Face.THREE));
        cards3.add(new Card(Card.Suit.SPADES, Card.Face.SEVEN));
        cards3.add(new Card(Card.Suit.SPADES, Card.Face.FOUR));
        cards3.add(new Card(Card.Suit.SPADES, Card.Face.FIVE));
        System.out.println(RummyUtils.cardsToSwapToMakeSequence(cards3).size());
        System.out.println(cards);
        System.out.println(cards2);
        System.out.println(cards3);
    }
}
