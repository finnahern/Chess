package board;
import model.ChessSquare;

public class ChessBoard{
	
	public ChessSquare[][] getChessBoard(){
		
		int chessBoardLength = 8;
		char ch = 'a';
		
		ChessSquare[][] myChessBoard = new ChessSquare[chessBoardLength][chessBoardLength];
		
		for(int i = 0; i < chessBoardLength; i++){
			for(int j = 0; j < chessBoardLength; j++){
				
				ChessSquare chessSquare = new ChessSquare();
				
				chessSquare.setColVal(ch);
				chessSquare.setRowVal(chessBoardLength - j);
				
				String ID = chessSquare.getColVal() + "" + chessSquare.getRowVal();
				chessSquare.setSquareID(ID);
				
				myChessBoard[i][j] = chessSquare;
				System.out.print(chessSquare.getSquareID());
			}
			ch++;	
		}
		
		return myChessBoard;
	}
}