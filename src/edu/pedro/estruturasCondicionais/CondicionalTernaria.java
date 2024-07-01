package edu.pedro.estruturasCondicionais;

import javax.security.auth.login.AccountLockedException;
import java.util.Scanner;

public class CondicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele e par ou impar: ");

        int numeroDigitado = sc.nextInt();

       String resultado = numeroDigitado % 2 == 0 ? "Par" : "Impar";

        System.out.printf("O número %d é: %s\n",numeroDigitado, resultado);


        sc.close();
    }
}
