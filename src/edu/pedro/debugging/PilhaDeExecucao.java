package edu.pedro.debugging;

import java.util.Random;

public class PilhaDeExecucao {
    public static void main(String[] args) {
        System.out.println("Iniciando o método main.");
        a();
        System.out.println("Finalizando o método main.");
    }
    static void a(){
        System.out.println("Iniciando o método a.");
        Random random = new Random(); // cria um obj do tipo Random para poder chamar o método nextInt
        boolean variavel = random.nextInt(3)==1;
        if(variavel){
            System.out.println("É verdade esse bilhete.");
        }
        else{
            System.out.println("Não é verdade esse bilhete");
        }
        b();
        System.out.println("Finalizando o método a.");
    }
    static void b(){
        System.out.println("Iniciando o método b.");
        for(int x = 0; x <= 5; x++){
            System.out.println(x);
        }
        c();
        System.out.println("Finalizando o método b.");
    }
    static void c(){
        System.out.println("Iniciando o método c.");
        Thread.dumpStack();
        System.out.println("Finalizando o método c.");
    }
}
