package Pieces;

import java.util.List;
import Chess.*;

public class Rook extends Piece {
    String pieceType = "Pieces.Rook";
    public Rook(int row, int column, Color color) {
        super(row, column, Piece.PieceType.ROOK, 5, color);
    }

    public List<Move> getValidMoves(Board board) {
        List<Move> moveList;
        int currentRow = this.getRow();
        int currentCol = this.getCol();
        Piece currentPiece = board.getPiece(currentRow, currentCol);
        /* movement logic!!!!
        for rooks, only any moves that add to the row between 0 and 7
        or the column between 0 and 7 are valid.
         */
        while (currentRow < 8) {
            if (currentPiece == null) {
                Move move = new Move(Converter.intsToAlgebraicNotation(currentRow, currentCol));
                moveList.add(move);
            }
        }
        return moveList;
    }
}
