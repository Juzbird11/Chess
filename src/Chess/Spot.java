package Chess;

public class Spot {
    private Piece piece;

    public String getSpot() {
        return "\u2661";
    }

    public String getSpotPiece() {
        if (piece == null) {
            return getSpot();
        }

        return piece.toString();
    }

    public Piece getPiece() {
        return piece != null ? piece : null;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void removePiece() {
        this.piece = null;
    }
}
 