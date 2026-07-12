package Pieces;

import java.util.List;
import Chess.*;

public class Rook extends Piece {
    String pieceType = "Pieces.Rook";
    public Rook(int row, int column, Color color) {
        super(row, column, PieceType.ROOK, 5, color);
    }

    public List<Move> getValidMoves(Board board) {
         /* movement logic!!!!
        for rooks, only any moves that add to the row between 0 and 7
        or the column between 0 and 7 are valid.
         */
        List<Move> moveList;
        int[][] offsets = {{+1, 0}, {-1,0}, {0,+1}, {0,-1}};
        for (int offset[] : offsets) {
            int currentRow = this.getRow();
            int currentCol = this.getCol();
            Piece currentPiece = board.getPiece(currentRow, currentCol);
            while (true) {
                currentRow += offset[0];
                currentCol += offset[1];
                if (currentRow < 0 || currentRow > 7 || currentCol < 0 || currentCol > 7) break;
                if (currentPiece == null) {
                    Move move = new Move(Converter.intsToAlgebraicNotation(this.getRow(), this.getCol()), Converter.intsToAlgebraicNotation(currentRow, currentCol), board);
                    moveList.add(move);
                } else if (currentPiece.color != this.color) {
                    Move move = new Move(Converter.intsToAlgebraicNotation(this.getRow(), this.getCol()), Converter.intsToAlgebraicNotation(currentRow, currentCol), board);
                    moveList.add(move);
                    break;
                } else {
                    break;
                }
                // check piece at (currentRow, currentCol), add move or break, same as before
            }
        }
        return moveList;
    }
}
