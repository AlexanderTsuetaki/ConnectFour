
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
//hello
	public int getRow(){
		return row;
	}
	public int getColumn(){
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
				otherPos.getColumn() == this.getColumn())
				return true;
		}
		return false;
	}

}
