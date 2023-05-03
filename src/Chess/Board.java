package Chess;

import Pieces.Pawn;

public class Board {
    private final Spot[][] board;

    private final char[] COLUMNS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private final char[] ROWS = {'8', '7', '6', '5', '4', '3', '2', '1'};

    public Board() {
        board = new Spot[8][8];

        initializeBoard();
    }

    public void initializeBoard() {
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Spot();
            }
        }

        initializePiece();
    }

    public Spot getSpot(Position position) {
        return board[position.getRow()][position.getColumn()];
    }

    public void setTarget(Position position, Piece piece) {
        getSpot(piece.getPosition()).removePiece();
        getSpot(position).setPiece(piece);
        piece.setPosition(position);
    }

    public void initializePiece() {
        //Pawn
        for(int i = 0; i < 8; i++) {
            board[1][i].setPiece(new Pawn(false, new Position(ROWS[1], COLUMNS[i])));
            board[6][i].setPiece(new Pawn(true, new Position(ROWS[6], COLUMNS[i])));
        }
    }

    public void getBoardCurrentPosition() {
        for(int i = 0; i < 8; i++) {
            System.out.print(8 - i  + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j].getSpotPiece());
                System.out.print(' ');
            }

            System.out.println();
        }

        System.out.println("____________________");
        System.out.println("    a b c d e f g h");
    }
}
