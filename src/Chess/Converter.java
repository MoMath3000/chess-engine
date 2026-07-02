package Chess;

public class Converter {
    public static char columnIntToChar(int column) {
        char columnChar = (char) ('a' + column);
        return columnChar;
    }
    public static int columnCharToInt(char column) {
        int columnInt = (int) (column -'a');
        return columnInt;
    }
    public static String intsToAlgebraicNotation(int row, int column) {
        String rowStr = String.valueOf(row);
        char colChar = Converter.columnIntToChar(column);
        String coordinate = colChar + rowStr;
        return coordinate;
    }
    public static int[] algebraicNotationToInts(String coordinate) {
        char columnChar = coordinate.charAt(0);
        int column = Converter.columnCharToInt(columnChar);
        int row = coordinate.charAt(1);
        return new int[] {row, column};
    }
}
