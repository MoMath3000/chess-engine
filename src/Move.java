import Pieces.Piece;
import PlayerState.White;

public class Move {
    protected int initialRow;
    protected int initialColumn;
    protected int rowChange;
    protected int columnChange;
    protected boolean validMove;
    protected Board board;

    public boolean isValidMove() {
        Piece targetSpace = board[initialRow + rowChange][initialColumn + columnChange];
        if (targetSpace.pieceType == Piece.PieceType.NULL && !White.isInCheck()) {
            return true;
        } else if (White.isInCheck()) {
            System.out.println("In check! Not a valid move.");
        } else {
            System.out.println("There is a " + targetSpace.pieceType + " on this space. Not a valid move.");
            return false;
        }
    }

    public Move(int rowChange, int columnChange, Board board) {
        this.rowChange = rowChange;
        this.columnChange = columnChange;
        this.board = board;
        isValidMove();
    }

}
