
package nadasviktoria_j_20230420;


public class Program {


    public static void main(String[] args) {
        Negyzet negyzet = new Negyzet();
       // Negyzet egyik = new Negyzet();
       // Negyzet masik = new Negyzet(); 
        negyzet.a = 2;
        System.out.println("állapot: " + negyzet.allapot());
        System.out.println("terület: " + negyzet.terulet());
    }
    
    
    package vonal_alap;
    
    public class Vonal {
        int hossz;
        
        boolean egyforma (Vonal masik) {
            return hossz == masik.hossz;
        }
         String allapot() {
             return "Vonal(hossz=" + hossz + ")";
         }
    }
    

}
