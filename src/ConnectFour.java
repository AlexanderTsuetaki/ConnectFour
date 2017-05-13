
public class ConnectFour implements BoardGame {
	private int[][] board;
	private int currentPlayer;
	private Position[] winningPositions;
	private int winner;
	
	public ConnectFour() {
		board = new int[6][7];
		winningPositions = new Position[4];
	}

	@Override
	public void newGame() {
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				board[i][j] = 0;
			}
		}
		winner = 0;
		winningPositions = new Position[4];
	}

	@Override
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

	@Override
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
									winningPositions[0] = new Position(i, j);
									winningPositions[1] = new Position(i+upDown, j+leftRight);
									winningPositions[2] = new Position(i+(2*upDown), j+(2*leftRight));
									winningPositions[3] = new Position(i+(3*upDown), j+(3*leftRight));
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

	@Override
	public Position[] getWinningPositions() {
		return winningPositions;
	}

	@Override
	public boolean columnFull(int column) {
		return (board[0][column] != 0);
	}

	@Override
	public void play(int column) {
		if (!columnFull(column)){
			for (int i = board.length-1; i >= 0; i--){
				if (board[i][column] == 0) {
					board[i][column] = currentPlayer;
					break;
				}
			}
		}
		currentPlayer = currentPlayer % 2 + 1;
		
	}

	@Override
	public int[][] getBoard() {
		return board;
	}
	
	

}
