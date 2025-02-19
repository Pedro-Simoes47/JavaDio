package edu.pedro.desafiosDIO;
import java.util.Scanner;
public class ControleDeSaques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double limiteDiario = sc.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ;i++) {

            double valorSaque = sc.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        sc.close();
    }
}
