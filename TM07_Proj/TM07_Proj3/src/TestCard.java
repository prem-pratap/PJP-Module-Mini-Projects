import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestCard {

	public static void main(String[] args) {
		Set<Card> set=new TreeSet<Card>();
		Scanner sc=new Scanner(System.in);
		int card_count=0;
		int loop=0;
		do {
			System.out.println("Enter a card:");
			Card card=new Card();
			char sym=sc.next().charAt(0);
			card.setSymbol(sym);
			card.setNumber(sc.nextInt());
			if(set.add(card))
				card_count++;
			loop++;
		}while(card_count!=4);
		System.out.println("Four symbols gathered in "+loop+" cards");
		System.out.println("Cards in set are: ");
		Iterator<Card> iter=set.iterator();
		while(iter.hasNext()) {
			Card c=iter.next();
			System.out.println(c.getSymbol()+" "+c.getNumber());
		}
	sc.close();	
	}

}
