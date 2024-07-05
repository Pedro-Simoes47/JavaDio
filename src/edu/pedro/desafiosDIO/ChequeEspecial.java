package edu.pedro.desafiosDIO;
import java.util.Scanner;
public class ChequeEspecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = sc.nextDouble();
        double saque = sc.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transação realizada com sucesso");
        }
        // TODO: Verificar se o saque ultrapassa o limite do cheque especial
        else if(saque <= saldo+limiteChequeEspecial) {
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            System.out.println("Transação realizada com sucesso utilizando o cheque especial");
        }
        else {
            System.out.println("Transação não realizada. Limite do cheque especial exedido");
        }
        // Fechar o scanner para evitar vazamentos de recursos
        sc.close();
    }
}
