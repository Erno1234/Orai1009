
package negyzetprogram;

public class negyzet {
    private int oldal;
    private double x;
    private double y;
    
    
    public int getOldalhossz(){
        return oldal;
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

    public void setOldal(int oldal) {
        this.oldal = oldal;
    }

    public double getOldal() {
        return oldal;
    }

    public double terulet() {
        return oldal * oldal;
    }

    @Override
    public String toString() {
        return "negyzet{" + "x=" + x + ", y=" + y + ", oldal=" + oldal + ", területe=" + terulet() + '}';
    }
    
}
