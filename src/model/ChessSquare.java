package model;

public class ChessSquare{

	private boolean occupied;
	private char colValue;
	private int rowValue;
	private String squareID;
	
	//Getter/Setter
	//Occupied
	public boolean isOccupied(){
		
		return occupied;
	}
	
	public void setOccupied(boolean occupied){
		
		this.occupied = occupied;
	}
	
	//Column Value
	public char getColVal(){
		
		return colValue;
	}
	
	public void setColVal(char colValue){
		
		this.colValue = colValue;
	}
	
	//Row Value
	public int getRowVal(){
		
		return rowValue;
	}
	
	public void setRowVal(int rowValue){
		
		this.rowValue = rowValue;
	}
	
	//Square ID
	public String getSquareID(){
		
		return squareID;
	}
	
	public void setSquareID(String squareID){
		
		this.squareID = squareID;
	}
}