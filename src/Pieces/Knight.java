package Pieces;

import java.util.List;
import Chess.*;

public class Knight extends Piece {
    String pieceType = "Pieces.Knight";
    public Knight(int row, int column, Color color) {
        super(row, column, Piece.PieceType.KNIGHT, 3, color);
    }
}
