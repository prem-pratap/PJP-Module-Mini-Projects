import java.util.TreeSet;

public class Card implements Comparable<Card>{
	private char symbol;
	private int number;
	
	public Card() {
		super();
	}
	public Card(char sym,int num) {
	this.symbol=sym;
	this.number=num;
	}
	
	public char getSymbol() {
		return symbol;
	}
	public int getNumber() {
		return number;
	}
	
	public void setSymbol(char sym) {
		this.symbol=sym;
	}
	public void setNumber(int num) {
		this.number=num;
	}

	public int compareTo(Card o) {
        if (this.symbol < o.symbol) return -1;
        else if (this.symbol > o.symbol) return 1;
        else return 0;
    }

	public boolean equals(Object obj){
        if (obj instanceof Card) {
            Card card = (Card) obj;
            return (card.symbol == this.symbol);
        } else 
            return false;
        }
	
	
}
