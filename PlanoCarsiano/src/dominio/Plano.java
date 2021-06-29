
package dominio;

public class Plano {
    private int x;
    private int y;

    public Plano(int x, int y) {
        this.x = x;
        this.y = y;
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
    public String toString() {
        return "x = " + this.x + "   " + "y = " + this.y;
    }

}

