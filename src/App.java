import java.util.Scanner;

import Chess.Board;
import Chess.Piece;
import Chess.Position;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Board board = new Board();

            do {
                System.out.print("\033\143");
                System.out.flush();

                board.getBoardCurrentPosition();

                try {
                    System.out.println();
                    System.out.print("Get piece: ");
                    
                    String s = sc.nextLine();
                    Position position = new Position(s.charAt(1), s.charAt(0));

                    Piece piece = board.getSpot(position).getPiece();

                    System.out.println(piece.toString());
                    System.out.println(piece.getColor()); 
                    System.out.println((piece.getMoves(board)));

                    System.out.println();
                    System.out.print("Set Target: ");
                    s = sc.nextLine();

                    board.setTarget(new Position(s.charAt(1), s.charAt(0)), piece);

                } catch(Exception e) {
                    System.out.println(e);
                }
            } while(true);
        }
    }
}