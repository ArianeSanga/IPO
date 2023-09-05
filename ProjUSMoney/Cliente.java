package ProjUSMoney;

public class Cliente {
    public static void main(String[] args) {
        // Caso 1 - Somar dólares sem centavos
        USMoney money1Case1 = new USMoney(10, 0);
        USMoney money2Case1 = new USMoney(5, 0);
        USMoney resultadoCase1 = money1Case1.plus(money2Case1);

        // Caso 2 - Somar dólares com centavos
        USMoney money1Case2 = new USMoney(12, 50);
        USMoney money2Case2 = new USMoney(1, 30);
        USMoney resultadoCase2 = money1Case2.plus(money2Case2);

        // Caso 3 - Somar dólares e centavos
        USMoney money1Case3 = new USMoney(50, 75);
        USMoney money2Case3 = new USMoney(25, 80);
        USMoney resultadoCase3 = money1Case3.plus(money2Case3);

        // Caso 4 - Dólar com valor negativo
        USMoney money1Case4 = new USMoney(-5, 25);
        USMoney money2Case4 = new USMoney(3, 50);
        USMoney resultadoCase4 = money1Case4.plus(money2Case4);

        // Caso 5 - Centavo com valor negativo
        USMoney money1Case5 = new USMoney(76, 21);
        USMoney money2Case5 = new USMoney(87, -213);
        USMoney resultadoCase5 = money1Case5.plus(money2Case5);

        // Caso 6 - Somar dólares com centavos acima de 99
        USMoney money1Case6 = new USMoney(7, 90);
        USMoney money2Case6 = new USMoney(2, 80);
        USMoney resultadoCase6 = money1Case6.plus(money2Case6);

        // Caso 7 - Somar dólares e centavos acima de 99
        USMoney money1Case7 = new USMoney(5, 99);
        USMoney money2Case7 = new USMoney(2, 150);
        USMoney resultadoCase7 = money1Case7.plus(money2Case7);

        System.out.println("Caso 1: " + resultadoCase1.RetornaValor());
        System.out.println("Caso 2: " + resultadoCase2.RetornaValor());
        System.out.println("Caso 3: " + resultadoCase3.RetornaValor());
        System.out.println("Caso 4: " + resultadoCase4.RetornaValor());
        System.out.println("Caso 5: " + resultadoCase5.RetornaValor());
        System.out.println("Caso 6: " + resultadoCase6.RetornaValor());
        System.out.println("Caso 7: " + resultadoCase7.RetornaValor());
    }
}
