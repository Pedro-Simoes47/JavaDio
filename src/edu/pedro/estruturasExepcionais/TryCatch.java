package edu.pedro.estruturasExepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura");
            double altura = sc.nextDouble();


            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            sc.close();

        }
        catch (Exception e) {
            System.out.println("Algo deu errado! Use . para informar a altura e somente digitos para informar a idade.");
        }
    }

}
