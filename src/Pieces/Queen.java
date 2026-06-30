package Pieces;

public class Queen extends Piece {
    String pieceType = "Pieces.Queen";
    public Queen(int row, int column, Color color) {
        super(row, column, Piece.PieceType.PAWN, 9, color);
    }
}
