/**
 * ZaehleHanoi.java
 */
public class ZaehleHanoi {
    public static void main(String[] args) {
        System.out.println(hanoi(5));
    }
    public static int hanoi(int scheiben){
        if(scheiben == 1) return 1;
        return hanoi(scheiben-1) * 2 + 1;
    }
}
