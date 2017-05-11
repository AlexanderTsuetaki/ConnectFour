
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
<<<<<<< HEAD
	public void getRow(){
		return row;
	}
	public void getCol(){
=======
	public int getRow(){
		return row;
	}
	public int getCol(){
>>>>>>> 18owenst/master
		return col;
	}
	public void setRow(int r){
		row = r;
	}
	public void setCol(int c){
		col = c;
	}
<<<<<<< HEAD
	public boolean equals(Object other){
		if (!(other.instanceOf(Position)))
			return false;
		if (other.getRow() == this.getRow() && other.getCol() == this.getCol())
			return true;
=======
	
	@Override
	public boolean equals(Object other){
		if (other instanceof Position) {
			Position otherPos = (Position)other;
			if (otherPos.getRow() == this.getRow() && 
				otherPos.getCol() == this.getCol())
				return true;
		}
>>>>>>> 18owenst/master
		return false;
	}

}
