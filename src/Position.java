/**
 * The position class for use in the ConnectFour.java class
 * @author 18owenst/18tsuetaki
 * @version 5/15/17
 */
public class Position {
	private	int row;
	private int col;
	/**
	 * 0 args constructor that sets the row and column of the positions as -1
	 */
	public Position() {
		row = -1;
		col = -1;
	}
	/**
	 * the constructor of the Position class that sets the row and col to the correct values
	 * @param r
	 * @param c
	 */
	public Position(int r, int c) {
		row = r;
		col = c;
	}
	/**
	 * returns the row
	 * @return row
	 */
	public int getRow(){
		return row;
	}
	/**
	 * returns the column
	 * @return col
	 */
	public int getColumn(){
		return col;
	}
	/**
	 * sets the row value to a new designated value
	 * @param r
	 */
	public void setRow(int r){
		row = r;
	}
	/**
	 * sets the col value to a new designated value
	 * @param c
	 */
	public void setCol(int c){
		col = c;
	}
	
	/**
	 * An equals method. Finds if two Positions are equal and returns true or false accordingly
	 */
	public boolean equals(Object other){
		if (other instanceof Position) {
			Position otherPos = (Position)other;
			if (otherPos.getRow() == this.getRow() && 
				otherPos.getColumn() == this.getColumn())
				return true;
		}
		return false;
	}
	
	/*
	public String toString() {
		return "(" + row + ", " + col + ")";
	}
	*/

}
