
public class Position {
	private	int row;
	private int col;
	public Position() {
		row = -1;
		col = -1;
	}
	public Position(int r, int c) {
		row = r;
		col = c;
	}
	public int getRow(){
		return row;
	}
	public int getCol(){
		return col;
	}
	public void setRow(int r){
		row = r;
	}
	public void setCol(int c){
		col = c;
	}
	
	@Override
	public boolean equals(Object other){
		if (other instanceof Position) {
			Position otherPos = (Position)other;
			if (otherPos.getRow() == this.getRow() && 
				otherPos.getCol() == this.getCol())
				return true;
		}
		return false;
	}

}
