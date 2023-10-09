
package negyzetprogram;

public class NegyzetProgram {
    private static negyzet n1 = new negyzet();
    
    public static void main(String[] args) {
        System.out.println("Négyzet oldal hossza: "+ n1.getOldalhossz() +" X koordináta: " +n1.getX() +" Y koordináta: " +n1.getY());
    }
    
}
