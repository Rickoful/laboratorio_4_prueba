import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos términos de Fibonacci quieres ver? ");
        int n = scanner.nextInt();
        
        int primero = 0, segundo = 1;
        
        System.out.print("Serie Fibonacci: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(primero + " ");
            
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
        
        scanner.close();
    }
}