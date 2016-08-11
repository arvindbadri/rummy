import java.util.*;

public class RummyUtils {

    public static Boolean isSetOfNCards(List<Card> cards) {
        return cardsToSwapToMakeSet(cards).isEmpty();
    }

    public static Boolean isSequenceOfNCards(List<Card> cards) {
        return cardsToSwapToMakeSequence(cards).isEmpty();
    }

    public static void sort(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getFaceValue() - o2.getFaceValue();
            }
        });
    }
    
    public static void sortBySuit(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSuit().ordinal() - o2.getSuit().ordinal();
            }
        });
    }

    public static List<Card> cardsToSwap(List<Card> cards1, List<Card> cards2) {
        Set<Card> cardSet1 = new HashSet<>(cards1);
        Set<Card> cardSet2 = new HashSet<>(cards2);
        cardSet1.removeAll(cardSet2);
        cardSet1.remove(new Card(Card.Suit.WILDCARD, Card.Face.WILDCARD));
        return new ArrayList<>(cardSet1);
    }

    /*
    DOES NOT WORK WELL WITH DUPLICATES. REMOVE DUPLICATES BEFORE PROCEEDING.
     */
    public static List<Card> cardsToSwapToMakeSequence(List<Card> cards) {
        List<Card> minCardsToSwap = new ArrayList<>(cards);
        for (int i = 0; i < cards.size(); i++) {
            List<Card> sequence = SequenceGenerationUtil.generateSequenceRetainingCard(cards, i);
            sequence = cardsToSwap(cards, sequence);
            if (sequence.size() < minCardsToSwap.size()) {
                minCardsToSwap = sequence;
            }
        }
        return minCardsToSwap;
    }

    /*
    DOES NOT WORK WELL WITH DUPLICATES. REMOVE DUPLICATES BEFORE PROCEEDING.
     */
    public static List<Card> cardsToSwapToMakeSet(List<Card> cards) {
        List<Card> minCardsToSwap = new ArrayList<>(cards);
            for (int i = 0; i < cards.size(); i++) {
                List<Card> sequence = SetGenerationUtil.generateSetOfFour(cards.get(i));
                sequence = cardsToSwap(cards, sequence);
                if (sequence.size() < minCardsToSwap.size()) {
                    minCardsToSwap = sequence;
                }
            }
        return minCardsToSwap;
    }
}
