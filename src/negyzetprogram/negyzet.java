
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
    
    public double terulete(){
        return Math.pow(this.oldal, 2);
    }
    
    
}
