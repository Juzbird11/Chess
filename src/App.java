import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Start the game press except q: ");
        String s = sc.nextLine();

        Board board = new Board();

        while(s.charAt(0) != 'q') {
            System.out.print("\033\143");
            System.out.flush();

            board.getBoardCurrentPosition();

            try {
                System.out.println();
                System.out.print("Get piece: ");
                
                s = sc.nextLine();
                Piece piece = board.getSpot(s.charAt(1), s.charAt(0)).getPiece();
                System.out.println(piece.getName());
                System.out.println(piece.getColor());

                System.out.println();
                System.out.print("Set Target: ");
                s = sc.nextLine();

                board.setTaget(s.charAt(1), s.charAt(0), piece);

            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
            

            // System.out.println(board.setTaget(s.charAt(1), s.charAt(0)).putPiece(null););

        }
    }
}