

public class Card {
	private char symbol;
	private int number;
	
	public Card() {
		super();
	}
	public Card(char sym,int num ) {
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
	
	
	
}
