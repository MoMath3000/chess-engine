package Pieces;

import java.util.List;
import Chess.*;

public class King extends Piece {
    String pieceType = "Pieces.King";
    public King(int row, int column, Color color) {
        super(row, column, Piece.PieceType.KING, 9999, color);
    }
}
