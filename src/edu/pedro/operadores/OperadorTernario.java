package edu.pedro.operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int a = 5;
        int b = -6;

       String resultado = a == b ?"verdadeiro" :"falso"; // Condição ternária (? if) (: else)

        a++; // incremento
        b--; // decremento

        a = -a; // torna numero positivo em negativo
        b *= -1; // torna numero negativo em positivo

        System.out.println("Resultados: " + resultado + " " + a + " " + b);

    }
}
