
package negyzetprogram;

public class Koordinata {
    private double x,y;

    public Koordinata(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Koordinata{" + "x=" + x + ", y=" + y + '}';
    }

}
