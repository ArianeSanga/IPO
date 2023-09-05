package ProjTriangulo;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe os três valores inteiros para o conjunto " + i + ":");
            
            float lado1 = scanner.nextFloat();
            float lado2 = scanner.nextFloat();
            float lado3 = scanner.nextFloat();

            Triangulo triangulo = new Triangulo(lado1,lado2,lado3);

            
            if (triangulo.eTriangulo()) {
                String tipoTriangulo = triangulo.determinarTipoTriangulo();
                System.out.println("O conjunto " + i + " forma um triângulo " + tipoTriangulo);
            } else {
                System.out.println("O conjunto " + i + " não forma um triângulo.");
            }
        }
    }
}
