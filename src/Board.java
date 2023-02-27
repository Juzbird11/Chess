
public class Board {
    private final Spot[][] board;

    public Board() {
        board = new Spot[8][8];

        initializeBoard();
    }

    public void initializeBoard() {
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Spot(i, j);
            }
        }

        initializePiece();
    }

    public Spot[][] getboard() {
        return board;
    }

    public Spot getSpot(char row, char column) {
        Spot spot = board[8 - Character.getNumericValue(row)][column - 'a'];
        return spot;
    }

    public void setTaget(char row, char column, Piece piece) {
        Spot spot = board[8 - Character.getNumericValue(row)][column - 'a'];
        piece.getPosition().removePiece();
        piece.setPosition(spot);
        spot.putPiece(piece);
    }

    public void initializePiece() {
        //Pawn
        for(int i = 0; i < 8; i++) {
            board[1][i].putPiece(new Piece("\u2659", false, board[1][i]));
            board[6][i].putPiece(new Piece("\u265F", true, board[6][i]));
        }

        //Castle
        board[0][0].putPiece(new Piece("\u2656", false, board[0][0]));
        board[0][7].putPiece(new Piece("\u2656", false, board[0][7]));
        board[7][0].putPiece(new Piece("\u265c", true, board[7][0]));
        board[7][7].putPiece(new Piece("\u265c", true, board[7][0]));

        //Knight
        board[0][1].putPiece(new Piece("\u2658", false, board[0][1]));
        board[0][6].putPiece(new Piece("\u2658", false, board[0][6]));
        board[7][1].putPiece(new Piece("\u265E", true, board[7][1]));
        board[7][6].putPiece(new Piece("\u265E", true, board[7][6]));

        //Bishop
        board[0][2].putPiece(new Piece("\u2657", false, board[0][2]));
        board[0][5].putPiece(new Piece("\u2657", false, board[0][5]));
        board[7][2].putPiece(new Piece("\u265d", true, board[7][2]));
        board[7][5].putPiece(new Piece("\u265d", true, board[7][5]));

        //King Queen
        board[0][3].putPiece(new Piece("\u2655", false, board[0][3]));
        board[0][4].putPiece(new Piece("\u2654", false, board[0][4]));
        board[7][3].putPiece(new Piece("\u265b", true, board[7][3]));
        board[7][4].putPiece(new Piece("\u265a", true, board[7][4]));
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
