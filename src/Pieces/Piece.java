package Pieces;

import java.util.List;

public abstract class Piece {
    protected int row;
    protected int column;

    public enum PieceType { KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN, NULL };
    public enum Color { WHITE, BLACK, NULL }
    protected PieceType pieceType;
    protected Color color;
    protected int pieceValue;

    protected boolean captured = false;
    protected boolean moved = false;

    public abstract List<Move> getValidMoves(Board board);

    public Piece(int row, int column, PieceType pieceType, int pieceValue, Color color) {
        this.row = row;
        this.column = column;
        this.pieceType = pieceType;
        this.pieceValue = pieceValue;
        System.out.println(this.pieceType + " created at coordinate " + this.getCoordinate());
    }

    public String toString() {
        return this.color.toString() + " " + this.pieceType.toString();
    }

    public String getCoordinate() {
        return this.row + "" + (char) ('a' + this.column);
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.column;
    }

}
