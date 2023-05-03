package Chess;

import java.util.LinkedList;

abstract public class Piece {
    protected boolean isWhite = false;
    private Position position;

    public Piece(boolean isWhite, Position position) {
        this.isWhite = isWhite;
        this.position = position;
    }

    public String getColor() {
        return isWhite ? "White" : "Black";
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    abstract public LinkedList<String> getMoves(Board board);
}
