class Piece {
    private boolean isWhite = false;
    private String name;
    private Spot position;

    public Piece(String name, boolean isWhite, Spot initSpot) {
        this.isWhite = isWhite;
        this.name = name;
        this.position = initSpot;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return isWhite == true ? "White" : "Black";
    }

    public Spot getPosition() {
        return position;
    }

    public void setPosition(Spot spot) {
        this.position = spot;
    }

    public void move(Board board) {

    }
}
