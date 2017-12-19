package methods;

/**
 * This class implements a Tic-Tac-Toe game created throught the use of
 * two-dimensional arrays, for loops, if-else statement, and different primative
 * data types.
 * 
 * @version 1.0
 * @author Luis Mendez
 *
 */

public class Game {

	char[][] table = new char[3][3];

	public void initializeGame() {
		for (int i = 0; i < 3; i++)
			for (int p = 0; p < 3; p++)
				table[i][p] = ' ';
	}

	/**
	 * 
	 * @param row
	 *          the rows that the game board will contain
	 * @param column
	 *          the column that the game board will contain This returns the
	 *          statement back as true or false
	 * @return if the rows and columns are legal
	 */
	public boolean checkIfLegal(int row, int column) {
		if ((row > 2 || column > 2) || (row < 0 || column < 0))
			return true;

		else if (table[row][column] == 'x' || table[row][column] == 'o')
			return true;

		return false;
	}

	/**
	 * 
	 * @param player
	 *          creates the player that will play
	 * @param row
	 *          the rows that the game board will contain
	 * @param column
	 *          the column that the game board will contain
	 */
	public void changeBoard(char player, int row, int column) {
		table[row][column] = player;

	}

	public void displayBoard() {

		System.out
				.println("  0  " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
		System.out.println("    --+-+--");
		System.out
				.println("  1  " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
		System.out.println("    --+-+--");
		System.out
				.println("  2  " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
		System.out.println("     0 1 2 ");
	}

	public char changePlayer(char player) {
		char newTurn = 'e';
		if (player == 'o')
			newTurn = 'x';
		if (player == 'x')
			newTurn = 'o';
		return newTurn;
	}

	/**
	 * 
	 * @return true if it's within the array boundaries and false if does'nt exist
	 */
	public boolean checkIfWinner() {
		if (table[0][0] == table[1][0] && table[1][0] == table[2][0]
				&& (table[0][0] == 'x' || table[0][0] == 'o'))
			return true;
		else if (table[0][1] == table[1][1] && table[1][1] == table[2][1]
				&& (table[0][1] == 'x' || table[0][1] == 'o'))
			return true;
		else if (table[0][2] == table[1][2] && table[1][2] == table[2][2]
				&& (table[0][2] == 'x' || table[0][2] == 'o'))
			return true;
		else if (table[0][0] == table[0][1] && table[0][1] == table[0][2]
				&& (table[0][0] == 'x' || table[0][0] == 'o'))
			return true;
		else if (table[1][0] == table[1][1] && table[1][1] == table[1][2]
				&& (table[1][0] == 'x' || table[1][0] == 'o'))
			return true;
		else if (table[2][0] == table[2][1] && table[2][1] == table[2][2]
				&& (table[2][0] == 'x' || table[2][0] == 'o'))
			return true;
		else if (table[0][0] == table[1][1] && table[1][1] == table[2][2]
				&& (table[0][0] == 'x' || table[0][0] == 'o'))
			return true;
		else if (table[2][0] == table[1][1] && table[1][1] == table[0][2]
				&& (table[2][0] == 'x' || table[2][0] == 'o'))
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @return return true or false for a tie
	 */
	public boolean checkIfTie() {
		for (int i = 0; i < 3; i++)
			for (int p = 0; p < 3; p++)
				if (table[i][p] == ' ')
					return false;

		return true;
	}

}
