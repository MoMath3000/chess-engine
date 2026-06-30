package Pieces;

import java.util.List;

public class Rook extends Piece {
    String pieceType = "Pieces.Rook";
    public Rook(int row, int column, Color color) {
        super(row, column, Piece.PieceType.ROOK, 5, color);
    }

    public List<Move> getValidMoves(Board board) {
        List<Move> moveList;
        int currentRow = this.getRow();
        int currentCol = this.getCol();
        /* movement logic!!!!
        for rooks, only any moves that add to the row between 0 and 7
        or the column between 0 and 7 are valid.
         */
        for (currentRow < 8) {
            if ((board.pieces[currentRow][currentCol] == null) & !King.inCheck(this.color))
        }
        return moveList;
    }
}
