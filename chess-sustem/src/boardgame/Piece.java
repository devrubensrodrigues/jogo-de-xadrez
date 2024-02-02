package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;
    public Piece() {

    }
    public Piece(Board board) {
        position = null;
        this.board = board;
    }
    protected Board getBoard() {
        return board;
    }

    public abstract boolean possibleMoves();
    public boolean possibleMove(Position position) {
        return true;
    }
    public boolean isThereAnyPossibleMove() {
        return true;
    }
}
