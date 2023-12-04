/**
 * Weihnachtsbaum.java
 */
public class Weihnachtsbaum {
    public static void main(String[] args) {
        int höhe = 14;
        char zeichen = '+';
        for(int i = 0; i < höhe; i++){
            printKette(zeichen, höhe-i, 1+i*2);
        }
    }
    public static void printKette(char zeichen, int start, int laenge){
        for(int i = 1; i < start; i++){
            System.out.print(" ");
        }
        for(int i = 0; i < laenge; i++){
            System.out.print(zeichen);
        }
        System.out.println();
    }
}
