
package negyzetprogram;

public class NegyzetProgram {
       
    public static void main(String[] args) {
        new NegyzetProgram().feladat();
    }
    
    private void feladat(){
        negyzet n = new negyzet();
        n.setOldal(2);
        n.setX(20);
        n.setY(30);
        
        System.out.println(n.toString());
    }
}
