
package negyzetprogram;

public class NegyzetProgram {


       
    public static void main(String[] args) {
        new NegyzetProgram().feladat();

    }
    
    private void feladat(){
        negyzet n = new negyzet();
        Koordinata koor = new Koordinata();
        n.setOldal(2);
        koor.setX(20);
        koor.setY(30);
        
        System.out.println(n.toString()+ koor.toString());
    }
}
