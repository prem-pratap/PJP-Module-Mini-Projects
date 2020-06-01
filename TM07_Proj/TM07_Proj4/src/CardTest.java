import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CardTest {

	public static void main(String[] args) {
		TreeMap<Character,ArrayList<Card>> map=new TreeMap<Character, ArrayList<Card>>();
		Set<Entry<Character, ArrayList<Card>>> set=map.entrySet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of cards:");
		int noOfCards=sc.nextInt();
		for(int i=1;i<=noOfCards;i++) {
			System.out.println("Enter card "+i+":");
			char sym=sc.next().charAt(0);
			int num=sc.nextInt();
			Card obj=new Card();
			obj.setSymbol(sym);
			obj.setNumber(num);
			if(!map.containsKey(sym)) {
				ArrayList<Card> alist=new ArrayList<Card>();
				alist.add(obj);
				map.put(sym,alist);
			}
			else {
				ArrayList<Card> alist=map.get(sym);
				alist.add(obj);
			}
		}
		System.out.println("Distinct symbols are:");
		for(char c:map.keySet())
			System.out.print(c+" ");
		Iterator<Entry<Character, ArrayList<Card>>> iter=set.iterator();
		while(iter.hasNext()) {
			int sum=0;
			Map.Entry<Character,ArrayList<Card>> me=iter.next();
            ArrayList<Card> list = me.getValue();
			System.out.println("\nCards in "+ me.getKey()+" symbol");
			for(Card card:list) {
				System.out.println(card.getSymbol()+" "+card.getNumber());
				sum=sum+card.getNumber();}
			System.out.println("Number of cards:"+list.size());
			System.out.println("Sum of Numbers:"+sum);
			
		}
		sc.close();
	}

}
