import java.util.ArrayList;
import java.util.List;

public class SwapsRequiredEvaluator {

	private static int FIVE = 5;
	private static int FOUR = 4;
	private static int THREE = 3;


	public static List<Card> numberofSwaps(List<Card> cards) {

		ArrayList<Card> remainingCards;

		remainingCards = new ArrayList<Card>(findCardsNotInAnySequence(cards, FOUR));
		remainingCards = new ArrayList<Card>(findCardsNotInAnySequence(remainingCards, THREE));
		
		return remainingCards;

	}

	public static List<Card> findCardsNotInAnySequence(List<Card> cards, int seqLength) {
		
		RummyUtils.sort(cards);
		RummyUtils.sortBySuit(cards);
		
		ArrayList<Card> subList = null;
		ArrayList<Card> remainingCards = null;
		int minValue = 13;

		for (int i = 0; i <= cards.size() - seqLength; i++) {

			subList = new ArrayList<Card>(cards.subList(i, i + seqLength));

			if (RummyUtils.isSequenceOfNCards(subList)) {
				remainingCards = new ArrayList<Card>(findRemainingCards(cards, i, seqLength));
				break;
				
			} else {

				if (minValue > RummyUtils.cardsToSwapToMakeSequence(subList).size()) {
					remainingCards = new ArrayList<Card>(findRemainingCards(cards, i, seqLength));
					remainingCards.addAll((ArrayList<Card>) RummyUtils.cardsToSwapToMakeSequence(subList));
					minValue = RummyUtils.cardsToSwapToMakeSequence(subList).size();
				}
			}

		}
		return remainingCards;
	}
	
	public static List<Card> findRemainingCards(List<Card> cards, int index, int seqLength) {
	
		ArrayList<Card> remainingCards = new ArrayList<Card>();
		for(int i = 0; i < cards.size() ; i++){
			if(!(i >= index && i < index+seqLength))
				remainingCards.add(cards.get(i));
		}
		return remainingCards;
	}


}
