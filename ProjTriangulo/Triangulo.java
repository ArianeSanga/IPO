package ProjTriangulo;

public class Triangulo {

    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo (float lado1, float lado2, float lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public  boolean eTriangulo() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
    
    public  String determinarTipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}
