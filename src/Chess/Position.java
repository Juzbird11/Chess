package Chess;

public class Position {
    private char column;
    private char row;

    public Position(char row, char column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return 8 - Character.getNumericValue(this.row);
    }

    public int getColumn() {
        return this.column - 'a';
    }

    @Override
    public String toString() {
        return "" + this.column + this.row;
    }
}
