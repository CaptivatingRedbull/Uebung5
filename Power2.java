import java.util.Scanner;
/**
 * Power2.java
 */
public class Power2 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Basis: ");
        int basis = Integer.parseInt(scanner.nextLine());

        System.out.print("Exponent: ");
        int exponent = Integer.parseInt(scanner.nextLine());

        scanner.close();

        System.out.println(power(basis,exponent));
    }
    public static long power(int basis, int exponent){ 
        return (exponent==0? 1: basis * power(basis, exponent-1));
    }
}
