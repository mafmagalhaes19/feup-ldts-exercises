public class Position {
    private int x;
    private int y;

    public Position (int new_x, int new_y){
        x = new_x;
        y = new_y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Position p = (Position) o;
        return this.getX() == p.getX() && this.getY() == p.getY();
    }

}
