package Chess;

import Pieces.Piece;

public class Move {
    protected Piece piece;
    protected int initialRow;
    protected int initialCol;
    protected Board board;
    protected int newRow;
    protected int newCol;

    public Move(String from, String to, Board board) {
        this.board = board;
        this.initialCol = (int) from.charAt(0);
        this.initialRow = (int) from.charAt(1);
        this.newCol = (int) to.charAt(0);
        this.newRow = (int) to.charAt(1);
        this.piece = board.pieces[initialRow][initialCol];
    }
}
