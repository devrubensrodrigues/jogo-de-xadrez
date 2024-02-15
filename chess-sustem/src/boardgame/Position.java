package boardgame;

public class Position {
    public int row;
    public int column;
    public Position() {

    }
    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }
    public Integer getColumn() {
        return column;
    }
    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
