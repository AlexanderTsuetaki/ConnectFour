
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
	public void getRow(){
		return row;
	}
	public void getCol(){
		return col;
	}
	public void setRow(int r){
		row = r;
	}
	public void setCol(int c){
		col = c;
	}
	public boolean equals(Object other){
		if (!(other.instanceOf(Position)))
			return false;
		if (other.getRow() == this.getRow() && other.getCol() == this.getCol())
			return true;
		return false;
	}

}
