package ProjDado;

import java.util.Random;

public class Dado {
     

    public int GiraDados() {
        Random teste = new Random();

        int numero = teste.nextInt(6) + 1;

        return numero;
    
}

}
