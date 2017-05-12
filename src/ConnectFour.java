
public class ConnectFour implements BoardGame {
	private int[][] board;
	private Position[] winningPositions;
	private int currentPlayer;
	public ConnectFour() {
		board = new int[6][6];
	}

	@Override
	public void newGame() {
		for(int i = 0; i < board.length;i++){
			for(int j = 0; j< board[i].length;i++){
				board[i][j] = 0;
			}
		}
		
	}

	@Override
	public boolean gameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getWinner() {
		return currentPlayer;
	}

	@Override
	public Position[] getWinningPositions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean columnFull(int column) {
		if(board[board.length][column] !=0){
			return true;
		}
		return false;
	}

	@Override
	public void play(int column) {
		if(!columnFull(column)){
			for(int i = 0; i < board.length;i++){
				if(board[i][column]==0){
					board[i][column]= currentPlayer;
				}
			}
		}
		if (currentPlayer==1){
			currentPlayer= 2;
		}
		else{
			currentPlayer= 1;
		}
		
	}

	@Override
	public int[][] getBoard() {
		return board;
	}
	
	

}
