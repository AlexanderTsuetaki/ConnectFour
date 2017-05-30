/**
 * The class that holds the methods to be used in the ConnectFour Game in the ConnectFourGUI
 * @author 18owenst/18tsuetaki
 * @version 5/15/17
 */
public class ConnectFour implements BoardGame {
	private int[][] board;
	private int currentPlayer;
	private Position[] winningPositions;
	private int winner;
	/**
	 * the constructor for the ConnectFour class. 
	 */
	public ConnectFour() {
		board = new int[6][7];
		winningPositions = new Position[4];
		winningPositions[0] = new Position();
		winningPositions[1] = new Position();
		winningPositions[2] = new Position();
		winningPositions[3] = new Position();
		currentPlayer = 1;
	}

	/**
	 * resets the board for a new game by setting everything back
	 */
	public void newGame() {
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				board[i][j] = 0;
			}
		}
		winner = 0;
		winningPositions = new Position[4];
		currentPlayer = 1;
		winningPositions[0] = new Position();
		winningPositions[1] = new Position();
		winningPositions[2] = new Position();
		winningPositions[3] = new Position();
	}

	/**
	 * determines if the game is won or a draw and sets the winner accordingly
	 */
	public boolean gameOver() {
		if (getWinner() != 0) {
			winner = getWinner(); //set the winner here
			return true;
		} else {
			for (int r = 0; r < 6; r++) {
				for (int c = 0; c < 7; c++) {
					if (board[r][c] == 0)
						return false;
				}
			}
			return true;
		}
	}
	/**
	 * returns the winner and sets the winning positions.
	 */
	public int getWinner() {
		for (int player = 1; player < 3; player++) {
			for (int i = 0; i< board.length; i++){
				for(int j = 0;j<board[i].length; j++){
					if(board[i][j]==player){
						for(int upDown = 0;upDown<2;upDown++){
							for(int leftRight = -1;leftRight<2;leftRight++){
								if (upDown == 0 && leftRight == 0)
									continue; //skip if not checking any direction
								else if ((i+(3*upDown) < 0 || j+(3*leftRight) < 0) 
										|| (i+(3*upDown) > 5 || j+(3*leftRight) > 6))
									continue; //skip if the indexes are out of bounds
								else if((board[i+(upDown)][j+(leftRight)] == player) 
									&& (board[i+(2*upDown)][j+(2*leftRight)] == player) 
									&& (board[i+(3*upDown)][j+(3*leftRight)] == player)) 
								{
									//set the winning positions here
									if (upDown != 0) {
										winningPositions[3] = new Position(i, j);
										winningPositions[2] = new Position(i+upDown, j+leftRight);
										winningPositions[1] = new Position(i+(2*upDown), j+(2*leftRight));
										winningPositions[0] = new Position(i+(3*upDown), j+(3*leftRight));
									} else {
										winningPositions[0] = new Position(i, j);
										winningPositions[1] = new Position(i+upDown, j+leftRight);
										winningPositions[2] = new Position(i+(2*upDown), j+(2*leftRight));
										winningPositions[3] = new Position(i+(3*upDown), j+(3*leftRight));
									}
									return player;
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}

	/**
	 * returns the winning positions set in 
	 */
	public Position[] getWinningPositions() {
		return winningPositions;
	}

	/**
	 * returns if the column being checked is full 
	 * @param column 
	 */
	public boolean columnFull(int column) {
		return (board[0][column] != 0);
	}

	/**
	 * checks to see if a play is valid and then sets a space to the correct column if it is then changes the player
	 * @param column 
	 */
	public void play(int column) {
		if (!columnFull(column)){
			for (int i = board.length-1; i >= 0; i--){
				if (board[i][column] == 0) {
					board[i][column] = currentPlayer;
					break;
				}
			}
			currentPlayer = currentPlayer % 2 + 1;
		}
	}

	/**
	 * returns the current board state
	 */
	public int[][] getBoard() {
		return board;
	}
	
	

}
