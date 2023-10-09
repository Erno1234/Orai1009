
package negyzetprogram;

public class NegyzetProgram {


       
    public static void main(String[] args) {
        new NegyzetProgram().feladat();

    }
    
    private void feladat(){
        negyzet n1 = new negyzet(6, new Koordinata(3,8));
        negyzet n2 = new negyzet(12, new Koordinata(1,4));
        
        System.out.println(n1.toString());
        System.out.println(n2.toString());
    }
}
