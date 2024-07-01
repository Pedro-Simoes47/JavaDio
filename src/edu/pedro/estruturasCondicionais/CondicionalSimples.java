package edu.pedro.estruturasCondicionais;

public class CondicionalSimples {
    public static void main(String[] args) {

        double saldo = 200.50;
        double valorSaque = 140.00;

        if(valorSaque < saldo){
            saldo -= valorSaque;
        }
        System.out.println("Novo saldo: " + saldo);
    }
}