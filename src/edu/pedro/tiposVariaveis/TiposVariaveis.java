package edu.pedro.tiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        String nome = "Pedro Simoes";
        byte idade = 27;
        short anoNascimento = 1997;
        int quantidadeJogosNaSteam = 308;
        long numeroGigante = 12345678901239L;
        // Boa pratica usar L para declarar numeros do tipo Long se não sera tratado como int
        float valorPiBasico = 3.14f;
        // Boa pratica usar f para declarar numeros do tipo float se não sera tratado como double
        double pi = 3.141592653;

        short numero = 1;
        int numeroMaior = numero;
        short numero2 =  (short) numeroMaior;
        // usar casting quando for atribuir um valor que pode ser maior em um tipo menor.

    }
}
