package edu.pedro.tiposVariaveis;

// Calculadora de area de triangulo, retângulo e circulo.

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha qual tipo de area voce quer calcular: 1-Triangulo, 2-Retângulo, 3-Circulo");
        int escolhaUsuario = sc.nextInt();
        switch(escolhaUsuario){
            case 1:
                System.out.println("Entre quais os valores da base e da altura:");
                double base = sc.nextDouble();
                double altura = sc.nextDouble();
                double area = AreaTriangulo(base,altura);
                System.out.printf("A area do triangulo é de: %.2f\n",area);
                break;
            case 2:
                System.out.println("Entre quais os valores da base e da altura:");
                double baseRetangulo = sc.nextDouble();
                double alturaRetangulo = sc.nextDouble();
                double areaRetangulo = AreaRetangulo(baseRetangulo,alturaRetangulo);
                System.out.printf("A area do retângulo é de: %.2f\n",areaRetangulo);
                break;
            case 3:
                System.out.println("Entre o valor do raio: ");
                double raio = sc.nextDouble();
                double areaCirculo = AreaCirculo(raio);
                System.out.printf("A area do circulo e de: %.2f\n",areaCirculo);
                break;
        }
        sc.close();
    }

    public static double AreaTriangulo(double base, double altura){
        return base * altura / 2;
    }

    public static double AreaRetangulo(double base, double altura){
        return base * altura;
    }

    public static double AreaCirculo(double raio){
        final double valorPI = 3.14;
        return valorPI * Math.pow(raio,2);
    }
}
