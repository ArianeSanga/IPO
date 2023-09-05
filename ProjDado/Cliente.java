package ProjDado;

public class Cliente {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for (int i = 0; i < 3; i++) {
           
            int jogada1 = dado1.giraDados();
            int jogada2 = dado2.giraDados();

           
            int resultado = jogada1 + jogada2;

            System.out.printf("Dado1: %d\n", jogada1);
            System.out.printf("Dado2: %d\n", jogada2);
            System.out.printf("Resultado: %d\n\n", resultado);
        }
    }
}