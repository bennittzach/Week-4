import java.util.Random;

class Card {
	private int card, suit;
	private static String[] cardsvalue = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private static String[] suitsname = {"Hearts", "Diamonds", "Spades", "Clubs"};
	
	Card (int card, int suit) {
		this.card = card;
		this.suit = suit;
	}
	
	public String toString() {
		return cardsvalue[card] + " of " + suitsname[suit];
	}
	public int toCard() {
		return card;
	}
	public int toSuit() {
		return suit;
	}
private Card[] cards;
private int x;
public void Deck() {
	x = 51;
	cards = new Card[52];
	int y = 0;
	for (int a = 0; a <= 3; a++) {
		for (int b = 1; b <= 13; b++) {
		cards[y] = new Card(a,b);
		y++;
		}
	}
	x = 0;
}
public Card drawfromDeck() {
	Random gen = new Random();
	int i = 0;
	i = gen.nextInt(x);
	Card t = cards[i];
	cards[i] = cards [i];
	cards[i] = null;
	i--;
	return t;
}
public int returnAllCards() {
	return x;
}
public static void main(String[] args) {
		Deck deck = new Deck();
		Card A;
		System.out.println(deck.returnAllCards());
		while (deck.returnAllCards() != 0) {
			A = deck.drawfromDeck();
			System.out.println(A.toString());
		}
	}
}