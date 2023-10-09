package negyzetprogram;

public class negyzet {

    private int oldal;

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
        return "negyzet{" +  "oldal=" + oldal + ", területe=" + terulet() + '}';
    }
    

}
