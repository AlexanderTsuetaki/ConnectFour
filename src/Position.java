
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
	public getRow(){
		return row;
	}
	public getCol(){
		return col;
	}
	public setRow(int r){
		row = r;
	}
	public setCol(int c){
		col = c;
	}
	public equals(Object other){
		if (!(other.instanceOf(Position)))
			return false;
		if (other.getRow() == this.getRow() && other.getCol() == this.getCol())
			return true;
		return false;
	}

}
