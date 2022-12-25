package TicTac;

public class Board {

	private char board[][];
	private int board_size = 3;
	private char p1symbol, p2symbol;
	private int count; // no of cell that is empty.
	private static final char EMPTY = ' ';

	public Board(char p1symbol, char p2symbol) {
		board = new char[board_size][board_size];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; i < board[0].length; j++) {
				board[i][j] = EMPTY;
			}
		}
		this.p1symbol = p1symbol;
		this.p2symbol = p2symbol;
	}

}
