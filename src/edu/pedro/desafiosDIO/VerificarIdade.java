package edu.pedro.desafiosDIO;
import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        // TODO: Verificar se a idade do cliente
        // TODO: Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        // TODO: Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta bancaria."

        if(idade >= 18){
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }
        else{
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }
        // Fechar o scanner para evitar vazamentos de recursos
        sc.close();
        }
}
