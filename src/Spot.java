public class Spot {
    private Piece piece;
    private int x;
    private int y;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getSpot() {
        return (this.x % 2 == this.y % 2) ? "+" : "-";
    }

    public Piece getOccupyingPiece() {
        return piece;
    }

    public String getSpotPiece() {
        if (piece == null) {
            return getSpot();
        }
        return piece.getName();
    }

    public Piece getPiece() {
        return piece != null ? piece : null;
    }

    public void putPiece(Piece piece) {
        this.piece = piece;
    }

    public void removePiece() {
        this.piece = null;
    }
}
 