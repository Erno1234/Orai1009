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
    
    public boolean Vizsgal(negyzet masik) {
        return oldal == masik.oldal;
    }

    @Override
    public String toString() {
        return "Negyzet{" + ", Oldal=" + oldal + ", Területe=" + terulet() + ", X=" + k.getX() + ", Y=" + k.getY() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.oldal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final negyzet other = (negyzet) obj;
        return this.oldal == other.oldal;
    }
    
    
    
}
