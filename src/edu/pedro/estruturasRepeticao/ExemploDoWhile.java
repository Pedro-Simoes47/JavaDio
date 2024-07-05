package edu.pedro.estruturasRepeticao;
import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("telefone tocando ...");

        } while (telefoneTocando());

    }
    private static boolean telefoneTocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        // a variavel atendeu recebe um valor aleatório entre 1 e 3 e se o número for 1 a condição e verdadeira senão e falsa.
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
