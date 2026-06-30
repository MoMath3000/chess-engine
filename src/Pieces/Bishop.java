package Pieces;

public class Bishop extends Piece {
    String pieceType = "Pieces.Bishop";
    public Bishop(int row, int column, Color color) {
        super(row, column, Piece.PieceType.BISHOP, 3, color);
    }
}
