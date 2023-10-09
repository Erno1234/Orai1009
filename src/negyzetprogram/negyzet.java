package negyzetprogram;

public class negyzet {

    private int oldal;
    private Koordinata k;
    
    public negyzet(int oldal, Koordinata k) {
        if (oldal <= 0) {
            oldal = 1;
        }
        this.oldal = oldal;
        this.k = k;
    }

    public int getOldalhossz() {
        return oldal;
    }
    
    public void setOldal(int oldal) {
        if (oldal <= 0) {
            oldal = 1;
        }
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
        return "Negyzet{" + ", Oldal=" + oldal + ", Területe=" + terulet() + ", X=" + k.getX() + ", Y=" + k.getY() + '}';
    }
    

}
