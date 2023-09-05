import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe os três valores inteiros para o conjunto " + i + ":");
            
            int lado1 = scanner.nextInt();
            int lado2 = scanner.nextInt();
            int lado3 = scanner.nextInt();
            
            if (eTriangulo(lado1, lado2, lado3)) {
                String tipoTriangulo = determinarTipoTriangulo(lado1, lado2, lado3);
                System.out.println("O conjunto " + i + " forma um triângulo " + tipoTriangulo);
            } else {
                System.out.println("O conjunto " + i + " não forma um triângulo.");
            }
        }
        
        scanner.close();
    }
    
    public static boolean eTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
    
    public static String determinarTipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}