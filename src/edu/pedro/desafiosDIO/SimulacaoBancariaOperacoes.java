package edu.pedro.desafiosDIO;

import java.util.Scanner;

public class SimulacaoBancariaOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    double valorDeposito = sc.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    double valorSaque = sc.nextDouble();
                    if(valorSaque <= saldo){
                        saldo -= valorSaque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    }
                    else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}
