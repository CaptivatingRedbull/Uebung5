/**
 * Fakult.java
 */
public class Fakult {
    public static void main(String[] args) {
        int gezogen = 6, gesamt = 49;
        System.out.println(fak(gesamt)/(fak(gesamt-gezogen)*fak(gezogen)));
    }
    public static double fak(int n){
        double erg = 1; 
        for (int i = 1; i <= n; i++){
            erg *= i;
        }
        return erg;
    }
}
