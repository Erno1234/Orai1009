
package negyzetprogram;

public class NegyzetProgram {


       
    public static void main(String[] args) {
        new NegyzetProgram().feladat();

    }
    
    private void feladat(){
        negyzet n1 = new negyzet(6, new Koordinata(3,8));
        
        System.out.println(n1.toString());
    }
}
