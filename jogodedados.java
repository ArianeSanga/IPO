import java.util.Random;

public class jogodedados {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        int jogadas = 0;
        int jogadas2 = 0;

        jogadas = dado1.GiraDados();
        System.out.println("dado1: " + jogadas);
        jogadas = jogadas + dado1.GiraDados();
        System.out.println("dado1: " + jogadas);
        jogadas = jogadas + dado1.GiraDados();
        System.out.println("dado1: " + jogadas);

        jogadas2 = dado2.GiraDados();
        System.out.println("dado2: " + jogadas2);
        jogadas2 = jogadas2 + dado2.GiraDados();
        System.out.println("dado2: " + jogadas2);
        jogadas2 = jogadas2 + dado2.GiraDados();
        System.out.println("dado2: " + jogadas2);
        
    }

}

class Dado {

    public int GiraDados() {
        Random teste = new Random();

        int numero = teste.nextInt(6) + 1;

        return numero;
    }
}
