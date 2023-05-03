package Pieces;
import java.util.LinkedList;

import Chess.Board;
import Chess.Piece;
import Chess.Position;

public class Pawn extends Piece {
    public Pawn(boolean isWhite, Position position) {
        super(isWhite, position);
    }

    @Override
    public LinkedList<String> getMoves(Board board) {
        LinkedList<String> result = new LinkedList<>();

        return result;
    }

    public String toString() {
        return this.isWhite ? "\u265F" : "\u2659";
    }
}
