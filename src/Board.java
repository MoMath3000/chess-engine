import Pieces.Piece;

public class Board {
    protected Piece[][] pieces = new Piece[8][8];

    public Board(Piece[][] pieces) {
        this.pieces = pieces;
        getBoardState();
    }

    public String toString() {
        int row = 0;
        int col = 0;
        String returnString = "";
        while (row < 8 && col < 8) {
            returnString += pieces[row][col].toString() + "\t";
            if (col == 7) {
                returnString += "\n";
                row++;
                col = 0;
            } else {
                row++;
            }
        }
        return returnString;
    }

    public void addPiece(Piece piece, int row, int col) {
        this.pieces[row][col] = piece;
    }

    public void getBoardState() {
        System.out.println(this.pieces.toString());
    }
}
