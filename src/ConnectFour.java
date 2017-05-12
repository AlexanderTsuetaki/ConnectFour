
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
		for (int i = 0;i< board.length;i++){
			for(int j = 0;j<board[i].length;i++){
				if(board[i][j]==currentPlayer){
					for(int upDown = 0;upDown<2;upDown++){
						for(int leftRight = -1;leftRight<2;leftRight++){
							if (upDown == 0 && leftRight == 0){
								continue;
							}
							
							if((board[i+(2*upDown)][j+(2*leftRight)] == currentPlayer)&&(board[i+(3*upDown)][j+(3*leftRight)] == currentPlayer)){
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public int getWinner() {
		return currentPlayer;
	}

	@Override
	public Position[] getWinningPositions() {
		
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
