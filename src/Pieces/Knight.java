package Pieces;

public class Knight extends Piece {
    String pieceType = "Pieces.Knight";
    public Knight(int row, int column, Color color) {
        super(row, column, Piece.PieceType.KNIGHT, 3, color);
    }
}
