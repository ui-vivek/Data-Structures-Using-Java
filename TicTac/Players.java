package TicTac;

public class Players {

	private String name;
	private char symbol;

	public Players(String name, char symbol) {
		setname(name);
		setsymbol(symbol);
	}

	public void setname(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	public String getname() {
		return this.name;
	}

	public void setsymbol(char symbol) {
		if (symbol != '\0') {
			this.symbol = symbol;
		}

	}

	public char getsymbol() {
		return this.symbol;
	}
}
