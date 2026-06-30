package Pieces;

public class Pawn extends Piece {
    String pieceType = "Pieces.Pawn";
    public Pawn(int row, int column, Color color) {
        super(row, column, PieceType.PAWN, 1, color);
    }
}
