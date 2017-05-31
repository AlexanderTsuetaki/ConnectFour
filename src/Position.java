/**
 * The Position class for use in ConnectFour
 * @author 18owenst/18tsuetaki
 * @version 5/15/17
 */
public class Position {
	private	int row;
	private int col;
	
	/**
	 * Zero-args constructor that sets the row and column of the positions to -1
	 */
	public Position() {
		row = -1;
		col = -1;
	}
	
	/**
	 * Parameterized constructor of the Position class that sets the row and col to the given values
	 * @param r, the row
	 * @param c, the column
	 */
	public Position(int r, int c) {
		row = r;
		col = c;
	}
	/**
	 * Returns the row of this Position
	 * @return row
	 */
	public int getRow(){
		return row;
	}
	/**
	 * Returns the column of this Position
	 * @return col
	 */
	public int getColumn(){
		return col;
	}
	/**
	 * Sets row to the given value
	 * @param r, the new row
	 */
	public void setRow(int r){
		row = r;
	}
	/**
	 * Sets col to the given value
	 * @param c, the new column
	 */
	public void setCol(int c){
		col = c;
	}
	
	/**
	 * An equals method. Finds if two Positions are equal and returns true or false accordingly.
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
