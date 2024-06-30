package edu.pedro.tiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        String nome = "Pedro Simões";
        byte idade = 27; // valor min: -128, valor max: 127
        short anoNascimento = 1997; // valor min: -32.768, valor max: 32.767
        int quantidadeJogosNaSteam = 308; // valor min: -2.147.483.648, valor max: 2.147.483.647
        long numeroGigante = 12345678901239L;
        // valor min: -9.223.372.036.854.775.808, valor max: 9.223.372.036.854.775.807
        // Boa prática usar L para declarar números do tipo Long se não sera tratado como int
        float valorPi = 3.14f;
        // Boa prática usar f para declarar números do tipo float se não sera tratado como double
        double pi = 3.141592653;

        short numero = 1;
        int numeroMaior = numero;
        short numero2 =  (short) numeroMaior;
        // usar casting quando for atribuir um valor que pode ser maior em um tipo menor.

        final double VALOR_PI = 3.14;
        // constante usando capslock por convenção final garante que ela não tera seu valor atualizado.


    }
}
